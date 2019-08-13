package com.spr.aop;
class OutofStockException extends RuntimeException{
	public OutofStockException() {
	  super("Stock Exausted..");
	}
	public OutofStockException(String message) {
		super(message);
	}
}

public class Customer {
	public static int product = 50;

	public void purchase(int qty) {

		if (qty < product) {
			product -= qty;
			System.out.println("Current stock " + product);
		} else {
			throw new OutofStockException();
		}
	}

}
