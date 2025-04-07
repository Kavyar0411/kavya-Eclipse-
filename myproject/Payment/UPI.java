package com.mvj.interface_1;

public class UPI implements Payment{
	private String UpiID;


	public UPI(String UpiID) {
		super();
		// TODO Auto-generated constructor stub
		this.UpiID=UpiID;
	}
	@Override
	public void process(double amt) {
		// TODO Auto-generated method stub
		System.out.println("Processing UPI payment of $"+amt +"using ID "+UpiID);
	}

}
