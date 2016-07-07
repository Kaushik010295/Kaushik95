package com.niit.ShoppingCart;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("C");
		al.add("C++");
		al.add("PHP");
		System.out.println(al);
		System.out.println("Does this list contains java??" + al.contains("Java"));
		al.add(2, "COBOL");
		System.out.println(al);
		System.out.println(al.isEmpty());
		System.out.println(al.size());
		Iterator<String> itr = al.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	

	}

}
