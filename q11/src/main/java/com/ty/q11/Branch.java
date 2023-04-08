package com.ty.q11;

import java.util.List;

public class Branch {
private String location;
private List<ProvisionStore> stores;
public Branch(String location, List<ProvisionStore> stores) {
	super();
	this.location = location;
	this.stores = stores;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public List<ProvisionStore> getStores() {
	return stores;
}
public void setStores(List<ProvisionStore> stores) {
	this.stores = stores;
}
@Override
public String toString() {
	return "Branch [location=" + location + ", stores=" + stores + "]";
}

}
