package com.edureka.javajee.exceptions;

public class AccountOperation {
	
	private double balance = 0.0;
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public double withdraw(double amount) throws InsufficientBalanceException {
		if (amount > balance) {
			throw new InsufficientBalanceException("Insufficient Balance");
		} else {
			balance -= amount;
			return amount;
		}
	}
	
	public double getBalance() {
		return this.balance;
	}

}
