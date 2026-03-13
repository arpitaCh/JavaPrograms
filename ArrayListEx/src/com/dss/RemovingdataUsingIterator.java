package com.dss;

import java.util.ArrayList;
import java.util.Iterator;

public class RemovingdataUsingIterator {

	public static void main(String[] args) {
		ArrayList<Employee> al = new ArrayList<>();
		al.add(new Employee(11,"ratan"));
		al.add(new Employee(222,"arpita"));
		
		Iterator<Employee> itr = al.iterator();
		while(itr.hasNext()) {
			Employee emp= itr.next();
			if(emp.eid == 11) {
				itr.remove();
			}
		}
		for(Employee e: al) {
			System.out.println(e.eid + " " + e.ename);
		}

	}

}
