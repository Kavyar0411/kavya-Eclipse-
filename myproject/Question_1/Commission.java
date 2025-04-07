package com.mvj.Question_1;

import java.util.Scanner;

public class Commission {
	
		String Name;
		String Address;
		String Phone;
		double Sales_amount;
		
		public Commission() {
			super();
			// TODO Auto-generated constructor stub
		}
		public void accept_details() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter Name");
			Name=sc.nextLine();
			System.out.println("Enter Address");
			Address=sc.nextLine();
			System.out.println("Enter Phone number");
			Phone=sc.nextLine();
			System.out.println("Enter Sales amount");
			Sales_amount=sc.nextDouble();
		}
		public double calculate_commission() {
			double commission=0.0;
			if(Sales_amount>=100000) {
		       commission = Sales_amount*0.10;
			}
			else if(Sales_amount>=50000 && Sales_amount<100000 ) {
				commission=Sales_amount*0.05;	
			}
			else if(Sales_amount>=30000 && Sales_amount<50000) {
				commission=Sales_amount*0.03;
			}
			else{
				commission=0.0;
				
			}
			return commission;
		}

}
