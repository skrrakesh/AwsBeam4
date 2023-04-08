package com.ty.q22;

import java.util.List;

public class Branch {
private int branchid;
private String branchname;
private List<Student> students;
public int getBranchid() {
	return branchid;
}
public void setBranchid(int branchid) {
	this.branchid = branchid;
}
public String getBranchname() {
	return branchname;
}
public void setBranchname(String branchname) {
	this.branchname = branchname;
}
public List<Student> getStudents() {
	return students;
}
public void setStudents(List<Student> students) {
	this.students = students;
}
@Override
public String toString() {
	return "Branch [branchid=" + branchid + ", branchname=" + branchname + ", students=" + students + "]";
}

}
