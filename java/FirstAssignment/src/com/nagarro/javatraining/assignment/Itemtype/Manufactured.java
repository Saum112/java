package com.nagarro.javatraining.assignment.Itemtype;

import com.nagarro.javatraining.assignment.Itemconstant.KeepConstant;
import com.nagarro.javatraining.assignment.Model.Item;

/**
 * Manufactured class implements the method for tax calculation of manufactured
 * item type.
 * 
 * @author saumya
 *
 */
public class Manufactured extends Item {

	public Manufactured(String name, String type, Double price, int quantity) {
		super(name, type, price, quantity);

	}

	/*
	 * Calctax is calculating the tax for manufactured type.
	 */
	public void Calctax() {

		double taxes, finalprice;

		taxes = KeepConstant.TAX_RATE_MANUFACTURED * getPrice()
				+ (1 + KeepConstant.TAX_RATE_MANUFACTURED) * getPrice() * KeepConstant.SURCHRGE_RATE_MANUFACTURED;
		settax(taxes);

		finalprice = getPrice() + taxes;

		setFinalprice(finalprice);

	}

}
