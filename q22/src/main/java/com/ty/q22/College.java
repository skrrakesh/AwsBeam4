package com.ty.q22;

import java.util.List;

public class College {
private String collegename;
private String location;
private List<Branch> branches;
public String getCollegename() {
	return collegename;
}
public void setCollegename(String collegename) {
	this.collegename = collegename;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public List<Branch> getBranches() {
	return branches;
}
public void setBranches(List<Branch> branches) {
	this.branches = branches;
}
@Override
public String toString() {
	return "College [collegename=" + collegename + ", location=" + location + ", branches=" + branches + "]";
}

}
