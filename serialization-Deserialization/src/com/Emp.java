package com;

import java.io.Serializable;

public class Emp implements Serializable {

	String ename;
	int eid;
	public Emp(String ename, int eid) {
		super();
		this.ename = ename;
		this.eid = eid;
	}
	
}
