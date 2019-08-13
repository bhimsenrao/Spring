package com.aop.xml;

public class Depositor {
	public static double depAmount=10000;
	public double deposit(int amount) {
		depAmount+=amount;
		return depAmount;
	}

	public double withdraw(int amount) {
		depAmount-=amount;
		return depAmount;
	}
}
