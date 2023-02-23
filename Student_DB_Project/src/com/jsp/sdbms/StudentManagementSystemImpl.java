package com.jsp.sdbms;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.jsp.customexception.InvalidChoiceException;
import com.jsp.customexception.StudentNotFoundException;

import customizedsorting.SortStudentByAge;
import customizedsorting.SortStudentById;
import customizedsorting.SortStudentByMarks;
import customizedsorting.SortStudentByName;
import sdbms.Student;

public class StudentManagementSystemImpl implements StudentManagementSystem{
	Scanner sc=new Scanner(System.in);
	Map<String,Student>db=new LinkedHashMap<String,Student>();

	@Override
	public void addStudent() {
		System.out.println("Enter Student Age: ");
		int age=sc.nextInt();
		System.out.println("Enter Student Name: ");
		String name=sc.next();
		System.out.println("Enter Student Marks: ");
		int marks=sc.nextInt();
		Student s=new Student(age, name, marks);
		db.put(s.getId(), s);
		System.out.println("Student Recorded Successfully");
		System.out.println("Student Id is "+s.getId());


	}

	@Override
	public void displayStudent() {
		String id=sc.next().toUpperCase();
		if(db.containsKey(id)) {
			System.out.println(db.get(id));
			Student std=db.get(id);
			System.out.println(std.getAge());
			System.out.println(std.getMarks());
			System.out.println(std.getName());
			System.out.println(std.getId());

		}
		else {
			try {
				String msg="Student With The Id "+id+" Is Not Found";
				throw new StudentNotFoundException(msg);
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}




	}

	@Override
	public void displayAllStudents() {
		if(db.size()!=0) {
			System.out.println("Student Details As Follows: ");
			Set<String>keys=db.keySet();
			for(String key:keys) {
				//				Student std=db.get(key);
				//				System.out.println(std);
				System.out.println(key+" "+db.get(key));
			}
		}
		else {
			try {
				String msg="Student DataBase Is Empty,Nothing To Display";
				throw new StudentNotFoundException(msg);
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}

		}


	}

	@Override
	public void removeStudent() {
		System.out.println("Enter Student Id: ");
		String id=sc.next().toUpperCase();
		if(db.containsKey(id)) {
			System.out.println("Student Record Found!");
			System.out.println(db.get(id));
			db.remove(id);
			System.out.println("Student Record Deleted Successfully");
		}
		else {
			try {
				String msg="Student With The Id "+id+" Is Not Found";
				throw new StudentNotFoundException(msg);
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}


	}

	@Override
	public void removeAllStudents() {
		if(db.size()!=0) {
			System.out.println("Student Record Available: "+db.size());
			db.clear();
			System.out.println("All The Record Are Deleted Successfully!");
			System.out.println("Student Record Available: "+db.size());
		}
		else {
			try {
				String msg="Student DataBase Is Empty,Nothing To Delete";
				throw new StudentNotFoundException(msg);
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public void updateStudent() {
		System.out.println("Enter Student Id: ");
		String id=sc.next().toUpperCase();
		if(db.containsKey(id)) {
			Student std=db.get(id);
			System.out.println("1.Update Age\n2.Update Name\n3.Update Marks\n4.Exit");
			System.out.println("Enter The Choice: ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Age");
				int age=sc.nextInt();
				std.setAge(age);// std.setAge(sc.nextInt());
				break;
			case 2:
				System.out.println("Enter Name");
				int name=sc.nextInt();
				std.setAge(name);// std.setName(sc.nextInt());
				break;
			case 3:
				System.out.println("Enter Marks");
				int marks=sc.nextInt();
				std.setAge(marks);// std.setMarks(sc.nextInt());
				break;
			case 4:
				System.out.println("Thanks for Updating");
				System.exit(0);
				break;
			default:
				try {
					String msg="Invalid Choice,Kindly Enter Valid Choice";
					throw new InvalidChoiceException(msg);
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				} 
			}//switch ends.
		}// if ends.
		else {
			try {
				String msg="Student With The Id "+id+" Is Not Found";
				throw new StudentNotFoundException(msg);
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
		}

	}

	@Override
	public void countStudents() {
		System.out.println("No Of Student Records "+db.size());

	}

	@Override
	public void sortStudent() {
		if(db.size()>1) {
			Set<String> keys=db.keySet();
			List<Student>l=new ArrayList<Student>();
			for(String key:keys) {
				l.add(db.get(key));
			}
			System.out.println("1.Sort By Id\n2.Sort By Name\n3.Sort By Age\n4.Sort By Marks");
			System.out.println("Enter The Choice: ");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				Collections.sort(l,new SortStudentById());
//				for(Student s:l) {
//					System.out.println(s);
//				}
				display(l);
				break;
			case 2:
				Collections.sort(l,new SortStudentByName());
//				for(Student s:l) {
//					System.out.println(s);
//				}
				display(l);
				break;
			case 3:
				Collections.sort(l,new SortStudentByAge());
//				for(Student s:l) {
//					System.out.println(s);
//				}
				display(l);
				break;
			case 4:
				Collections.sort(l,new SortStudentByMarks());
//				for(Student s:l) {
//					System.out.println(s);
//				}
				display(l);
				break;
			default:
				try {
					String msg="Invalid Choice,Kindly Enter Valid Choice";
					throw new InvalidChoiceException(msg);
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				} 
			}
		}
		else {
			try {
				String msg="No Suffecient Data To Sort";
				throw new StudentNotFoundException(msg);
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
			
		}
		

	}
	private static void display(List<Student>l) {
//		for(int i=0;i<l.size();i++) {
//			System.out.println(l);
//		}
		for(Student s:l) {
			System.out.println(s);
		}
	}

	@Override
	public void getStudentWithHighestMarks() {
		if(db.size()>1) {
			Set<String> keys=db.keySet();
			List<Student>l=new ArrayList<Student>();
			for(String key:keys) {
				l.add(db.get(key));
			}
			Collections.sort(l,new SortStudentByMarks());
			System.out.println(l.get(l.size()-1));
		}
		else {
			try {
				String msg="No Records Present To Display Highest Marks";
				throw new StudentNotFoundException(msg);
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
			
		}

	}

	@Override
	public void getStudentWithLowestMarks() {
		if(db.size()>1) {
			Set<String> keys=db.keySet();
			List<Student>l=new ArrayList<Student>();
			for(String key:keys) {
				l.add(db.get(key));
			}
			Collections.sort(l,new SortStudentByMarks());
			System.out.println(db.get(0));
		}
		else {
			try {
				String msg="No Records Present To Display Lowest Marks";
				throw new StudentNotFoundException(msg);
			}
			catch(Exception e){
				System.out.println(e.getMessage());
			}
			
		}

	}

}
