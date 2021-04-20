package com.nagarro.javatraining.assignment.Input;

import com.nagarro.javatraining.assignment.Itemconstant.*;

import com.nagarro.javatraining.assignment.Itemtype.Imported;
import com.nagarro.javatraining.assignment.Itemtype.Manufactured;
import com.nagarro.javatraining.assignment.Itemtype.Raw;
import com.nagarro.javatraining.assignment.Model.Item;

import java.io.IOException;
import java.util.Scanner;

/**
 * TakeInput class is responsible for taking values associated with an item as
 * input and also it check for any kind of exception.
 * 
 * @author saumya
 *
 */
public class TakeInput {

	public static Item enterInput() throws IOException {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		String name;
		String str;
		String type;
		double price;
		int quantity;
		boolean valid, checkdouble, checknegative, checkint;
		System.out.println("\nEnter the Item Details :");
		System.out.print("Enter the Item name : ");
		do {

			str = sc.next();
			valid = Validate.isStringOnlyAlphabet(str);

		} while (!valid);
		name = str;

		System.out.print("Enter the Item price : ");
		do {
			str = sc.next();
			checkdouble = Validate.checkDouble(str);
			checknegative = Validate.checkPriceNegative(Double.parseDouble(str));

		} while (!(checkdouble && checknegative));
		price = Double.parseDouble(str);

		System.out.print("Enter the Item type : ");
		do {
			str = sc.next();
			valid = Validate.checkItemType(str);
		} while (!valid);
		type = str.toLowerCase();

		System.out.print("Enter the Item Quantity : ");
		do {
			str = sc.next();
			checkint = Validate.checkInt(str);

			if (!checkint)
				continue;
			checknegative = Validate.checkNegative(Integer.parseInt(str));
		} while (!(checkint && checknegative));
		quantity = Integer.parseInt(str);

		Item i;
		switch (type) {
		case KeepConstant.RAW:
			i = new Raw(name, type, price, quantity);
			break;
		case KeepConstant.MANUFACTURED:
			i = new Manufactured(name, type, price, quantity);
			break;
		default:
			i = new Imported(name, type, price, quantity);
			break;

		}
		return i;
	}

}