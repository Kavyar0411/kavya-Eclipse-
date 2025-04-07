package com.mvj.Bank;


	class CheckingAccount extends Account {
	    private static final double LIMIT = 500;

	    public CheckingAccount(double initialBalance) {
	        super();
	    }

	    @Override
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposited: " + amount);
	        } else {
	            System.out.println("Invalid deposit amount.");
	        }
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (amount > 0 && balance + LIMIT >= amount) {
	            balance -= amount;
	            System.out.println("Withdrawn: " + amount);
	        } else {
	            System.out.println("Overdraft limit exceeded or invalid amount.");
	        }
	    }

	    @Override
	    public double getBalance() {
	        return balance;
	    }
	}


