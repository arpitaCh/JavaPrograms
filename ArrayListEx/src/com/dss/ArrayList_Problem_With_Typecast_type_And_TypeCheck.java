package com.dss;
// collection are not type safe because it contains heterogeneous data 
//so we have problem while reading the data with type cast and type check .
//So in collection generics concept introduced. 
import java.util.ArrayList;

public class ArrayList_Problem_With_Typecast_type_And_TypeCheck {
 public static void main(String[] args) {
	 
	 
	 ArrayList al = new ArrayList();
	 al.add(new Employee(234,"arpita"));
	 al.add(new Student(23,"satya"));
	 al.add(null);
	 al.add(null);
	 al.add('6');
	 //This below al will print employee@hascode for return type of object so we need to do like below 
	 System.out.println(al);
	// we need to iterate through al which is object 
	 for(Object o: al) {
		 if(o instanceof Employee) {
			 Employee e= (Employee) o;
			 System.out.println(e.eid + " " + e.ename) ;
		 }
		 if(o instanceof Student) {
			 Student s= (Student) o;
			 System.out.println(s.sid+ " " + s.sname) ;
		 }

	 }
	 
	 ArrayList al1 = new ArrayList();
	 al1.add(new Employee(2341,"asdf"));
	 al1.add(new Student(231,"sa566tya"));
	  //  how to know that al.get(1) will return student or employee so we need to do type check.
	 al1.get(1);
	 
	 Object o =al.get(0);
	 if( o instanceof Student) {
		 // this is type cast.
		 Student s1= (Student)o;
		 System.out.println(s1.sid +" " +s1.sname);
		 
	 }
	 if( o instanceof Employee) {
		 Employee e1= (Employee)o;
		 System.out.println(e1.eid +" " +e1.ename);
		 
	 }
	 
 }
}
