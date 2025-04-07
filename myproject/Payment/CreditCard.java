package com.mvj.interface_1;

public class CreditCard implements Payment{
	private String cardNo;

	

	public CreditCard(String cardNo) {
		super();
		this.cardNo=cardNo;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void process(double amt) {
		// TODO Auto-generated method stub
		System.out.println("Processing Credit Card payment of $"+amt +"using card" + cardNo);
		
	}



}
