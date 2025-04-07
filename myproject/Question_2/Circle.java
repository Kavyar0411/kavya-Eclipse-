package com.mvj.Question_2;

import java.util.Scanner;

public class Circle {
	double radius;
	String colour;
	 
	public void grtInput() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr Radius");
		radius=sc.nextDouble();
		System.out.println("Enter colour");
		sc.nextLine();
		colour=sc.nextLine();
		}
	public void calcArea() {
		double Area = Math.PI*radius*radius;
		System.out.println("The area of the circle with radius " + radius + " and colour " + colour + " is: " + Area);
	}

}
