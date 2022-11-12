package com.greatlearning.groupgradedassignment.Question2;

//Driver Code

public class Main {
	public static void main(String[] args) {

		TransacationBST BSTtoSkewed = new TransacationBST();

		// inserting values in the tree
		BSTtoSkewed.inputforBST();

		// updating and printing functions
		System.out.print("Output : ");
		BSTtoSkewed.UpdatingTransacationBST(BSTtoSkewed.node);
		BSTtoSkewed.TransactionTreeTraversal(BSTtoSkewed.newHead);
	}
}
