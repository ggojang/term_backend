import React, { useState, useEffect } from 'react';
import axios from 'axios';
import { makeStyles } from '@material-ui/core/styles';
import TreeView from '@material-ui/lab/TreeView';
import TreeItem from '@material-ui/lab/TreeItem';
import ExpandMoreIcon from '@material-ui/icons/ExpandMore';
import ChevronRightIcon from '@material-ui/icons/ChevronRight';

const ROOT_ID = '900000000000455006';

const useStyles = makeStyles(() => ({
  treeView: {
    fontSize: 'small',
    margin: '0 0 1px 0',
    userSelect: 'none',
  },
  labelBold: {
    fontSize: '0.88em',
    fontWeight: 'bold',
    lineHeight: 1.8,
    color: '#000',
  },
  labelNormal: {
    fontSize: '0.88em',
    fontWeight: 'normal',
    lineHeight: 1.8,
    color: '#000',
  },
}));

// 한 노드의 자식을 가져오는 함수
function fetchLevel(parentId) {
  return axios
    .get(`http://api.infoclinic.co/children/SNOMEDCT/${parentId}`)
    .then(res => res.data.sort((a, b) => (a.term > b.term ? 1 : -1)));
}

// 전체 트리를 BFS로 순회하면서
//   tree    : id → node
//   children: parentId → [childId]
//   boldSet : leaf이거나 leaf를 포함하는 조상 id 집합
async function buildFullTree() {
  const tree = {};
  const children = {};
  const parents = {};

  // BFS 큐: 처리할 parentId 목록
  const queue = [ROOT_ID];
  const visited = new Set([ROOT_ID]);

  while (queue.length > 0) {
    // 한 레벨을 병렬 fetch
    const batch = queue.splice(0, queue.length);
    const results = await Promise.all(batch.map(pid => fetchLevel(pid)));

    results.forEach((nodes, i) => {
      const pid = batch[i];
      children[pid] = nodes.map(n => n.conceptId);
      nodes.forEach(n => {
        tree[n.conceptId] = n;
        parents[n.conceptId] = pid;
        if (!visited.has(n.conceptId) && n.descendantCount > 0) {
          visited.add(n.conceptId);
          queue.push(n.conceptId);
        }
      });
    });
  }

  // bold 집합: leaf(descendantCount===0) → 위로 전파
  const boldSet = new Set();
  Object.values(tree).forEach(node => {
    if (node.descendantCount === 0) {
      let cur = node.conceptId;
      while (cur && !boldSet.has(cur)) {
        boldSet.add(cur);
        cur = parents[cur];
      }
    }
  });
  // 루트도 포함
  if (boldSet.size > 0) boldSet.add(ROOT_ID);

  return { tree, children, boldSet };
}

export default function Left({ setRefset }) {
  const classes = useStyles();

  const [tree, setTree]       = useState({});
  const [children, setChilren] = useState({});
  const [boldSet, setBoldSet] = useState(new Set());
  const [expanded, setExpanded] = useState([ROOT_ID]);

  useEffect(() => {
    buildFullTree().then(({ tree, children, boldSet }) => {
      setTree(tree);
      setChilren(children);
      setBoldSet(boldSet);
    });
  }, []);

  function handleToggle(_, nodeIds) {
    setExpanded(nodeIds);
  }

  function renderNode(id) {
    const node = tree[id];
    if (!node) return null;
    const isLeaf = node.descendantCount === 0;
    const isBold = boldSet.has(id);

    const label = (
      <span
        className={isBold ? classes.labelBold : classes.labelNormal}
        onClick={() =>
          setRefset({ name: node.term, id: node.conceptId, desc: isLeaf ? 0 : 1 })
        }
      >
        {node.term}{!isLeaf && ` (${node.descendantCount})`}
      </span>
    );

    const nodeChildren = children[id];
    if (isLeaf || !nodeChildren || nodeChildren.length === 0) {
      return <TreeItem key={id} nodeId={id} label={label} />;
    }
    return (
      <TreeItem key={id} nodeId={id} label={label}>
        {nodeChildren.map(cid => renderNode(cid))}
      </TreeItem>
    );
  }

  const rootChildren = children[ROOT_ID];
  const rootBold = boldSet.has(ROOT_ID);

  return (
    <TreeView
      className={classes.treeView}
      defaultCollapseIcon={<ExpandMoreIcon style={{ fontSize: 20 }} />}
      defaultExpandIcon={<ChevronRightIcon style={{ fontSize: 20 }} />}
      expanded={expanded}
      onNodeToggle={handleToggle}
    >
      <TreeItem
        nodeId={ROOT_ID}
        label={
          <span
            className={rootBold ? classes.labelBold : classes.labelNormal}
            onClick={() =>
              setRefset({ name: 'Reference Set', id: ROOT_ID, desc: 1 })
            }
          >
            Reference Set (113)
          </span>
        }
      >
        {rootChildren
          ? rootChildren.map(id => renderNode(id))
          : <TreeItem nodeId="loading" label="로딩 중..." />}
      </TreeItem>
    </TreeView>
  );
}
