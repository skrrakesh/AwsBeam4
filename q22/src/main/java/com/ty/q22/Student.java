package com.ty.q22;

public class Student {
private String studentid;
private String studentname;
private int marks;
public String getStudentid() {
	return studentid;
}
public void setStudentid(String studentid) {
	this.studentid = studentid;
}
public String getStudentname() {
	return studentname;
}
public void setStudentname(String studentname) {
	this.studentname = studentname;
}
public int getMarks() {
	return marks;
}
public void setMarks(int marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [studentid=" + studentid + ", studentname=" + studentname + ", marks=" + marks + "]";
}

}
