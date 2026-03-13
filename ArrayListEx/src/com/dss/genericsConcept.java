package com.dss;

import java.util.ArrayList;

public class genericsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Employee> al =new ArrayList <Employee>();
al.add(new Employee(111,"fghjj"));
al.add(new Employee(333,"yuii"));


ArrayList<Student> al1 =new ArrayList <Student>();
al1.add(new Student(444,"899"));
al1.add(new Student(566,"yuyugg"));

for(Employee e: al) {
	System.out.println(e.eid +" "+ e.ename);
  }

Employee e = al.get(1);
System.out.println(e.eid +" " + e.ename);

 }

}
