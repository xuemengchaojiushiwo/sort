package com.doublelink;

import org.junit.Test;

public class RBTreeTest {
	@Test
    public void testInsert() throws Exception {
		RBTree aRbTree = new RBTree();
		Node node = new Node(10, null, null);
		Node node1 = new Node(2, null, null);
		Node node2 = new Node(12, null, null);
		Node node3 = new Node(4, null, null);
		Node node4 = new Node(6, null, null);
		aRbTree.insertData(node, aRbTree.getRoot(), 1);
		aRbTree.insertData(node1, aRbTree.getRoot(), 1);
		aRbTree.insertData(node2, aRbTree.getRoot(), 1);
		aRbTree.insertData(node3, aRbTree.getRoot(), 1);
		aRbTree.insertData(node4, aRbTree.getRoot(), 1);
		aRbTree.firstCheck(aRbTree.getRoot());
    }
}
