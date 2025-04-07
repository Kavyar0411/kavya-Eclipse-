package com.mvj.interface_1;

public class PaymentService {
	public void makePayment(Payment pay, double amount) {
		pay.process(amount);
		
	}

}
