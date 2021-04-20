package com.nagarro.javatraining.assignment.Itemtype;

import com.nagarro.javatraining.assignment.Itemconstant.KeepConstant;
import com.nagarro.javatraining.assignment.Model.Item;

/**
 * Imported class implements the tax calculation for imported item type.
 * 
 * @author saumya
 *
 */
public class Imported extends Item {

	/*
	 * Here , Imported function(constructor) is initializing the variables -
	 * name,type,price,quantity
	 */
	public Imported(String name, String type, Double price, int quantity) {
		super(name, type, price, quantity);

	}

	/*
	 * Calctax is calculating the tax for imported type.
	 */

	public void Calctax() {

		double taxes, finalprice;

		taxes = KeepConstant.IMPORT_DUTY_IMPORTED * getPrice();
		settax(taxes);
		finalprice = getPrice() + taxes;
		setFinalprice(finalprice);
		if (finalprice <= 100) {
			taxes += KeepConstant.SURCHARGE_IMPORTED_FIVE;
			settax(taxes);
			finalprice += KeepConstant.SURCHARGE_IMPORTED_FIVE;
			setFinalprice(finalprice);
		} else if (finalprice > 100 && finalprice <= 200) {
			taxes += KeepConstant.SURCHARGE_IMPORTED_TEN;
			settax(taxes);
			finalprice += KeepConstant.SURCHARGE_IMPORTED_TEN;
			setFinalprice(finalprice);
		} else if (finalprice > 200) {
			finalprice = KeepConstant.RATE_IMPORTED * finalprice;
			setFinalprice(finalprice);
			taxes = finalprice - getPrice();
			settax(taxes);
		}

	}

}
