package com.mvj.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListDemo {

		public static void main(String[] args) {
			ArrayList <Integer >list=new ArrayList <Integer>();
			System.out.println("the size of the arraylist"+list.isEmpty());
			System.out.println("the size of the arraylist"+list.size());
			list.add(22);
			list.add(22);
			list.add(null);
			list.add(7);
			list.add(2221);
			//Collections.sort(list);
			//System.out.println(list);
			System.out.println("the size of the arraylist"+list.size());
			System.out.println(list);
			System.out.println(list.contains(55));
			list.remove(1);
			System.out.println(list);
			System.out.println("element at the position"+list.get(0));
		}

	}


