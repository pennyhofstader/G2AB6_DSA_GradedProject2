package com.greatlearning.groupgradedassignment.Question1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class OrderOfConstruction {
	public Integer NumOfFloors;
	public Integer[] FloorSize;

	// getting the user inputs
	public void getData() {
		System.out.println("Enter the total no. of floors in the building: ");
		Scanner sc = new Scanner(System.in);
		NumOfFloors = sc.nextInt();
		FloorSize = new Integer[NumOfFloors];
		System.out.println(" ");

		for (int i = 1; i <= NumOfFloors; i++) {
			System.out.println("Enter the floor size given on day: " + i);
			FloorSize[i - 1] = sc.nextInt();
		}
		sc.close();
	}

	// Calculate and print order of construction and totalFloorSize
	public void calculateAndPrintOrderOfConstruction(Integer[] FloorSize) {
		System.out.println("The order of construction is as follows");

		int j = 0;
		Integer[] FloorSizeSorted = FloorSize.clone();
		Arrays.sort(FloorSizeSorted, Collections.reverseOrder());

		Stack<Integer> Stack = new Stack<Integer>();

		// Loop over the unsorted data
		for (int i = 0; i < FloorSize.length; i++) {
			if (FloorSize[i] == FloorSizeSorted[j]) {
				if (i == FloorSize.length - 1)
					j = i;
				else
					j = i + 1;

				// Print the current floor as well as entire Stack than next element in sorted
				// list.
				System.out.println("Day: " + (i + 1));
				if (Stack != null) {
					System.out.print(FloorSize[i] + " ");
					while (!Stack.isEmpty()) {
						int val = Stack.pop();
						if (val >= FloorSizeSorted[j]) {
							System.out.print(val + " ");
						} else {
							Stack.push(val);
							j -= Stack.size();
							break;
						}
					}
					System.out.println("");

				} else {
					System.out.println(FloorSize[i]);

				}
			} else
			// Add the element to Stack
			{
				System.out.println("Day: " + (i + 1));
				Stack.push(FloorSize[i]);
				System.out.println();
			}
		}
	}
}
