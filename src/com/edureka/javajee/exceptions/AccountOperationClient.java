package com.edureka.javajee.exceptions;

public class AccountOperationClient {
	public static void main(String[] args) {
		AccountOperation account = new AccountOperation();
		account.deposit(2000);
		try {
			account.withdraw(2200);
		} catch (InsufficientBalanceException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());;
		}
		System.out.println(account.getBalance());
	}

}
