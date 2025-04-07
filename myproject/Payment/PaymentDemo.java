package com.mvj.interface_1;

public class PaymentDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Payment c=new CreditCard("a345df");
		Payment u=new UPI("a367yf");
		
		PaymentService ps=new PaymentService();
		ps.makePayment(c, 77);
		ps.makePayment(u,1000);
		

	}

}
