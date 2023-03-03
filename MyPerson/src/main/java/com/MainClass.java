package com;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManger=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManger.getTransaction();
		
//		Student s1=new Student(101,"manoj",82.5);
//		Student s2=new Student(102,"anoj",72.5);
		Student s3=new Student();
		s3.setId(103);
		s3.setName("resxc");
		s3.setMarks(44.5);
		entityTransaction.begin();
//		entityManger.persist(s1);
//		entityManger.persist(s2);
		entityManger.persist(s3);
		entityTransaction.commit();

	}

}
