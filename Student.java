package com.vp.model1;

public class Student {
	   int uid;
	   String uname;
	   String address;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int uid, String uname, String address) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.address = address;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", address=" + address + "]";
	}
	   
	}
