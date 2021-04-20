package com.nagarro.javatraining.assignment.Input;

import com.nagarro.javatraining.assignment.Itemconstant.KeepConstant;

/**
 * Validate class is handling all the exceptions possible while taking input
 * from the user*
 * 
 * @author saumya
 *
 */

public class Validate {
	public static boolean checkDouble(String str) {

		/*
		 * checkDouble() is checking if the entered value for the item's price is of
		 * type double or not.
		 */

		try {
			Double.parseDouble(str);
		} catch (NumberFormatException e) {
			System.err
					.print("You entered the Price type in wrong format . Please Enter the Price in decimal format : ");
			return false;
		}
		return true;
	}

	public static boolean isStringOnlyAlphabet(String str) {

		/*
		 * isStringOnlyAlphabet() is checking if the entered value for the item's name
		 * is containing only alphabets or not.
		 */

		if ((str != null) && (!str.equals("")) && (str.matches("^[a-zA-Z]*$")))
			return true;
		System.err.print("Please enter only alphabets in the Item name , any other value is not allowed ");
		return false;
	}

	/*
	 * checkItemType() is checking if the entered value for the item's type is from
	 * the given values.
	 */

	public static boolean checkItemType(String str) {
		if (str.equalsIgnoreCase(KeepConstant.RAW) || str.equalsIgnoreCase(KeepConstant.MANUFACTURED)
				|| str.equalsIgnoreCase(KeepConstant.IMPORTED))
			return true;
		System.err.print(
				"You entered the item type in wrong format . kindly enter again .\nEnter one of the following (raw,manufactured,imported) :");
		return false;
	}

	public static boolean checkInt(String str) {
		try {

			int checkint = Integer.parseInt(str);
			double checkdouble = Double.parseDouble(str);
			if (checkint != checkdouble)
				throw new NumberFormatException();
		} catch (NumberFormatException e) {
			System.err.print(
					"You entered the Quantity type in wrong format . Please Enter the Quantity in numeric format : ");
			return false;
		}
		return true;
	}

	/*
	 * checkNegative() is checking if the entered value for the item's quantity is
	 * negative.
	 */

	public static boolean checkNegative(int str) {
		try {
			if (str < 0)
				throw new ArithmeticException();

		} catch (ArithmeticException e) {
			System.err.print("Quantity cannot be negative , please enter positive value for quantity: ");
			return false;
		}

		return true;
	}

	/*
	 * checkNegative() is checking if the entered value for the item's price is
	 * negative.
	 */

	public static boolean checkPriceNegative(double str) {

		try {
			if (str < 0)
				throw new ArithmeticException();

		} catch (ArithmeticException e) {
			System.err.print("Price cannot be negative , please enter positive value for price: ");
			return false;
		}

		return true;
	}

}