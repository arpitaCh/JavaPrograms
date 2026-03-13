package com.dss;

import java.util.Comparator;

public class Enamecomp  implements Comparator{
  public int compare(Object o1, Object o2) {
	  Employee e1 =(Employee)o1;
	  Employee e2 =(Employee)o2;
	  
	return e1.ename.compareTo(e2.ename);
	  
  }
}
