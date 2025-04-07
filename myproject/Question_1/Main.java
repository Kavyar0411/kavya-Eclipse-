package com.mvj.Question_1;

public class Main {
	public static void main(String[] args) {
		Student st=new Student();
		Commission cm= new Commission();
		cm.accept_details();
		double commission=cm.calculate_commission();
		 System.out.println("The commission for " + cm.Name + " is: " +commission);
	}

}
