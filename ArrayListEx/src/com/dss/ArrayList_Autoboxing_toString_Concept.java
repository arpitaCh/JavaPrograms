package com.dss;

import java.util.ArrayList;

public class ArrayList_Autoboxing_toString_Concept {

	public static void main(String[] args) {
		
		//Autoboxing concept -> automatic conversion of premitive data to wrapper object.
		//int -> Integer
		//char -> character
		//double -> Double
		
		//toString concept => Arraylist contains multiple object like string ,float, integer, null , 
		//duplicate but ob every object toString() executed .
		
		// String,StringBufer, All wrapper class toString() returns content of object .
		
		// Autoboxing is done by compiler . before compilation code is look like below but after compilation
		//if we check the same code in .bin/.class file by using java Decompiler tool we will see use of
		// Inetger.valueOf(''), Character.valueOf('a');
		
		
		ArrayList al =new ArrayList();
		al.add(5);
		// before Autoboxing concept means before java 1.5 version we used add element in array like below .
		//al.add(Integer.valueOf(5));
		al.add(0);
		al.add(null);
		al.add('9');
		al.add('a');
		// al.add(Character.valueOf('a'));
		al.add(10.5);
		al.add("arpita");
		al.add(5);
		System.out.println(al);
		

	}

}
