package com.jsp.sdbms;

import java.util.Scanner;

import com.jsp.customexception.InvalidChoiceException;

public class Solutions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome To Student DataBase Management System");
		Scanner sc=new Scanner(System.in);	
		StudentManagementSystem sms=new StudentManagementSystemImpl();
		while(true) {
			System.out.println("1.Add Student\n2.Display Student\n3.Display All Students\n4.Remove Student\n5.Remove All Students\n6.Update Student\n7.Count Students\n8.Sort Students\n9.Get Student With HighestMarks\n10.Get Student With LowestMarks\n11.Exit\nEnter Your Choice");
			int choice=sc.nextInt();
			switch(choice) {
			case 1:
				sms.addStudent();
				break;
			case 2:
				sms.displayStudent();
				break;
			case 3:
				sms.displayAllStudents();
				break;
			case 4:
				sms.removeStudent();
				break;
			case 5:
				sms.removeAllStudents();
				break;
			case 6:
				sms.updateStudent();
				break;
			case 7:
				sms.countStudents();
				break;
			case 8:
				sms.sortStudent();
				break;
			case 9:
				sms.getStudentWithHighestMarks();
				break;
			case 10:
				sms.getStudentWithLowestMarks();
				break;
				default:
				try {
					String msg="Invalid";
					throw new InvalidChoiceException(msg);
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			
			}
			System.out.println("-------------------------------------");
		}

	}

}
