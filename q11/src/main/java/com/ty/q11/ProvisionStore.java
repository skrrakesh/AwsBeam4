package com.ty.q11;

import java.util.List;

public class ProvisionStore {
private String storename;
private String location;
private List<Customer> customers;
public String getStorename() {
	return storename;
}
public void setStorename(String storename) {
	this.storename = storename;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public List<Customer> getCustomers() {
	return customers;
}
public void setCustomers(List<Customer> customers) {
	this.customers = customers;
}
@Override
public String toString() {
	return "ProvisionStore [storename=" + storename + ", location=" + location + ", customers=" + customers + "]";
}
public ProvisionStore(String storename, String location, List<Customer> customers) {
	super();
	this.storename = storename;
	this.location = location;
	this.customers = customers;
}

}
