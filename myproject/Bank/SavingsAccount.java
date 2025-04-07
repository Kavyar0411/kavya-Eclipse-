package com.mvj.Bank;

class SavingsAccount extends Account {
	  

	    public SavingsAccount(double initial_balance) {
		super();
		// TODO Auto-generated constructor stub
	}

	    @Override
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount ;
	            System.out.println("Deposited: " + amount);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (amount > 0 && balance >= amount) {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount);
	        } else {
	            System.out.println("Insufficient balance or invalid amount.");
	        }
	    }

	    @Override
	    public double getBalance() {
	        return balance;
	    }
	}
	


