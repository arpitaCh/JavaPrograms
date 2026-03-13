package com.dss;

import java.util.Comparator;

public class EidComp implements Comparator {
    public int compare(Object o1, Object o2) {
    	
    	Employee e1= (Employee) o1;
    	Employee e2= (Employee) o2;
    	
    	if(e1.eid ==e2.eid)
    		return 0;
    	else if(e1.eid >= e2.eid)
    		return 1;
    	else if(e1.eid <= e2.eid)
    		return -1;
		return 0;
    	
    }
}
