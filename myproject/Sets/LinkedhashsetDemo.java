package com.mvj.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedhashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> lset=new LinkedHashSet<Integer>();
		lset.add(10);
		lset.add(30);
		lset.add(5);
		lset.add(15);
		System.out.println("LinkedHashset"+lset);
		
		//ArrayList<Integer> arr=new ArrayList<>(lset);
		//Collections.sort(arr);
		//System.out.println("sorted"+arr);
		
		TreeSet<Integer> t=new TreeSet<>(lset);
	
		System.out.println("natural sorting"+t);
	}

}
