package com.dss;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class Test1 {

//	public linkedHashSetImplementtaion(String empName, int empId) {
//		super(empName, empId);
//		// TODO Auto-generated constructor stub
//	}
//	
	

	

	public static void main(String[] args) {
		
		LinkedHashSet<Employee> al =new LinkedHashSet<Employee>();
		al.add(new Employee("arpita", 111));
		al.add(new Employee("satya", 345));
		al.add(new Employee("arpita", 111));
		
		Iterator<Employee> itr = al.iterator();
		
		while(itr.hasNext()) {
			Employee e= itr.next();
			System.out.println(e.empId +" "+ e.empName);
		}
	}

}
