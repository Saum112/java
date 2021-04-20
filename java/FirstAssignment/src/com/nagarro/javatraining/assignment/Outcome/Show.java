package com.nagarro.javatraining.assignment.Outcome;

import com.nagarro.javatraining.assignment.Model.Item;

/**
 * Show class is used for providing the expected outcome to the user.
 * 
 * @author saumya
 *
 */
public class Show {

	/*
	 * displayResult() is printing the required values on the output screen .
	 */
	public void displayResult(Item item) {
		String str = String.format("%-14s%-15.3f%-18.3f%-25.3f%-7d%-15.3f", item.getName(), item.getPrice(),
				item.gettax(), item.getFinalprice(), item.getQty(), item.getTotalPrice());
		System.out.println(str);
	}

	/*
	 * displayResultFormat() is printing the required values name on the output
	 * screen , so that user finds its easy to understand the values of each item .
	 */
	public static void displayResultFormat() {

		System.out.println("\n\n\nOutput:");
		String str = String.format("%-14s%-15s%-18s%-25s%-7s%-15s", "Name", "Price", "tax liability",
				"Final Price per Item", "Qty", "Total Price");
		System.out.println(str);
	}

}
