package com.dss;

import java.util.ArrayList;
import java.util.Collections;
 // comparator used for customized object. Internally it calls compare()
// and to sort more than one property of data like Employee id and ename .
//comparable is used for string and wrapper object because only they can implement comparable interface.
//comparable can sort only one property and., internally it implements compareTo() and it 
// can sort homogeneous type of data .



public class ComparatorTest {
 public static void main (String[] args) {
	 ArrayList<Employee> al =new ArrayList<>();
	 al.add(new Employee(111, "orpita"));
	 al.add(new Employee(45, "prpita25"));
	 al.add(new Employee(567, "arpita3"));
	 al.add(new Employee(67, "rpita4"));
	 
	 Collections.sort(al, new Enamecomp());
	 
	 for(Employee e: al) {
		 System.out.println(e.eid +" "+ e.ename);
	 }
	 
 }
}
