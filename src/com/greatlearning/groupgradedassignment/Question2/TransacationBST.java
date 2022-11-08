package com.greatlearning.groupgradedassignment.Question2;

class Node {
	int data;
	Node left, right;

	Node(int data) {
		this.data = data;
		left = right = null;
	}
}

class TransacationBST {
	Node node;
	Node prev = null;
	Node newHead = null;

	void UpdatingTransacationBST(Node root) {
		if (root == null)
			return;
		// looping and updating the right of ancestor and also the ancestor

		UpdatingTransacationBST(root.left);
		Node rightNode = root.right;

		// update new head to hold new root

		if (newHead == null) {
			newHead = root;
			root.left = null;
			prev = root;
		} else {

			prev.right = root;
			root.left = null;
			prev = root;
		}
		UpdatingTransacationBST(rightNode);
	}

	// traversing till leaf
	void TransactionTreeTraversal(Node root) {

		if (root == null)
			return;
		System.out.print(root.data + " ");
		TransactionTreeTraversal(root.right);
	}
}
