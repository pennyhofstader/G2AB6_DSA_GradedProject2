package com.greatlearning.groupgradedassignment.Question2;

//Driver Class

public class Main {
	public static void main(String[] args) {

		// inserting values in the tree
		TransacationBST tree = new TransacationBST();
		tree.node = new Node(50);
		tree.node.left = new Node(30);
		tree.node.right = new Node(60);
		tree.node.left.left = new Node(10);
		tree.node.right.left = new Node(55);

		// calling the updating and printing functions

		System.out.print("Output : ");
		tree.UpdatingTransacationBST(tree.node);
		tree.TransactionTreeTraversal(tree.newHead);
	}
}
