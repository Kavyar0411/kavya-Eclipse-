package com.mvj.Bank;

public class BankDetails {
	public static void main (String[] args) {
		 Account s1 = new SavingsAccount(1000);
	     Account c1 = new CheckingAccount(500);

	        s1.deposit(500);
	        s1.withdraw(300);
	        s1.displayBalance();

	        c1.deposit(1000);
	        c1.withdraw(1200);
	        c1.displayBalance();
	}

}
