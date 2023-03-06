package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetStudentById {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Student student=entityManager.find(Student.class,102);
		
		System.out.println("Student Id is: "+student.getId());
		System.out.println("Student Name is: "+student.getName());
		System.out.println("Student Marks is: "+student.getMarks());
		
//		entityTransaction.begin();  // not mandatory.
//		entityManager.merge(student);
//		entityTransaction.commit();

	}

}
