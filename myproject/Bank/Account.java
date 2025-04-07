package com.mvj.Bank;

public abstract class Account {
	  double  balance;
	  
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	 abstract void deposit(double amount);
	 abstract void withdraw(double amount);
	 abstract double getBalance();
	 
	 public void displayBalance() {
	        
			System.out.println("Current Balance: " + balance);
	    }

}
