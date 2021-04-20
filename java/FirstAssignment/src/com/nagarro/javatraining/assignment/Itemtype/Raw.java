package com.nagarro.javatraining.assignment.Itemtype;

import com.nagarro.javatraining.assignment.Itemconstant.KeepConstant;
import com.nagarro.javatraining.assignment.Model.Item;

/**
 * Raw class implements the method for tax calculation of raw item type.
 * 
 * @author saumya
 *
 */

public class Raw extends Item {

	public Raw(String name, String type, Double price, int quantity) {
		super(name, type, price, quantity);

	}

	/*
	 * Calctax is calculating the tax for manufactured type.
	 */

	public void Calctax() {

		double taxes, finalprice;

		taxes = KeepConstant.TAX_RATE_RAW * getPrice();
		settax(taxes);
		finalprice = getPrice() + taxes;
		setFinalprice(finalprice);

	}

}
