package com.nagarro.javatraining.assignment.Controller;

/**
 * Main class is responsible for storing all the values associated with an item to an arraylist . It is controller class 
 * , controlling all the operations needed to get the expected outcome.
 * 
 * @author saumya
 *
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;

import com.nagarro.javatraining.assignment.Input.*;
import com.nagarro.javatraining.assignment.Model.Item;
import com.nagarro.javatraining.assignment.Outcome.Show;

public class Main {

	private static Scanner sc;

	public static void main(String[] args) throws IOException {
		ArrayList<Item> list = new ArrayList<Item>();
		sc = new Scanner(System.in);
		char ch;
		Item item;
		Double aggPriceOfAllItems = 0.0;
		Double totalPrice;
		do {
			item = TakeInput.enterInput();
			item.Calctax();
			totalPrice = item.getQty() * item.getFinalprice();
			item.setTotalPrice(totalPrice);
			aggPriceOfAllItems += item.getTotalPrice();
			list.add(item);
			System.out.print("Do you want to enter another item details(y/n) : ");
			ch = sc.next().charAt(0);
		} while ((ch == 'y') || (ch == 'Y'));

		Show s = new Show();
		Show.displayResultFormat();
		for (Item items : list) {
			s.displayResult(items);
		}
		String str = String.format("\n%.3f", aggPriceOfAllItems);
		System.out.println(str);
	}

}