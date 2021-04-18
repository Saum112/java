package com.nagarro.javatraining.assignment1.Main;

import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.nagarro.javatraining.assignment1.input.TakeInput;
import com.nagarro.javatraining.assignment1.constant.Item;
import com.nagarro.javatraining.assignment1.Outcome.Show;


public class Main {

	public static void main(String[] args) throws IOException {
		ArrayList<Item> list = new ArrayList<Item>();
		BufferedReader obj = new BufferedReader(new InputStreamReader(System.in)) ;
		char ch ;
		Item i ;
		Double aggPriceOfAllItems= 0.0 ;
		Double totalPrice ;
		do
		{
			i = TakeInput.enterInput() ;
			i.calc_tax() ;
			totalPrice = i.getQty()*i.getFppi() ;
			i.setTotal_Price(totalPrice);
			aggPriceOfAllItems+=i.getTotal_Price() ;
			list.add(i);
			System.out.print("Do you want to enter another item details(y/n) : ");
			ch = obj.readLine().charAt(0) ;
		}while((ch=='y')||(ch=='Y'));

		//Show.displayResultFormat();
		for (Item item : list) {
			Show.displayResult(item);
		}
		String str = String.format("\n%f",aggPriceOfAllItems );
		System.out.println(str);
	}

}