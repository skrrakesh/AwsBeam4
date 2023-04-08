package com.ty.q11;

public class Customer {
private int customerid;
private String customername;
private long phno;
public Customer(int customerid, String customername, long phno) {
	super();
	this.customerid = customerid;
	this.customername = customername;
	this.phno = phno;
}
public int getCustomerid() {
	return customerid;
}
public void setCustomerid(int customerid) {
	this.customerid = customerid;
}
public String getCustomername() {
	return customername;
}
public void setCustomername(String customername) {
	this.customername = customername;
}
public long getPhno() {
	return phno;
}
public void setPhno(long phno) {
	this.phno = phno;
}
@Override
public String toString() {
	return "Customer [customerid=" + customerid + ", customername=" + customername + ", phno=" + phno + "]";
}
}
