package com.nagarro.javatraining.assignment.Model;

/**
 * Item class is storing all the the values associated with an item type. Also ,
 * here we are implementing setters and getters.
 * 
 * @author saumya
 *
 */

public abstract class Item {

	private String name;
	private double price;
	private int quantity;
	private String type;
	private double tax;
	private double finalprice;
	private double totalPrice;

	public Item(String name, String type, Double price, int qty) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.quantity = qty;
	}

	public abstract void Calctax();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double i) {
		this.price = i;
	}

	public double gettax() {
		return tax;
	}

	public void settax(double tax) {
		this.tax = tax;
	}

	public void setQty(int quantity) {
		this.quantity = quantity;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getFinalprice() {
		return finalprice;
	}

	public void setFinalprice(double finalprice) {
		this.finalprice = finalprice;
	}

	public int getQty() {
		return quantity;
	}

	public String getType() {
		return type;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}

}
