package com.jsp.com;

public class Employee {
	String id;
	String name;
	static int c=1; // static counter variable.
	Employee(String name){
		this.id="JSP "+c;
		this.name=name;
		c++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1=new Employee("Tom");
		System.out.println(e1.id+" "+e1.name);
		Employee e2=new Employee("Jerry");
		System.out.println(e2.id+" "+e2.name);
		Employee e3=new Employee("nobitha");
		System.out.println(e3.id+" "+e3.name);

	}

}
