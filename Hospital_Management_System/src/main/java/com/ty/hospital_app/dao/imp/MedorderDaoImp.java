package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.MedorderDao;
import com.ty.hospital_app.dto.Medorder;

public class MedorderDaoImp implements MedorderDao {

	public Medorder saveMedorder(int mid, Medorder medorder) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Medorder medorder1 = em.find(Medorder.class, mid);

		if (medorder != null) {
			et.begin();
			em.persist(medorder1);
			et.commit();
			return medorder1;
		} else {
			return null;
		}
	}

	public Medorder getMedorder(int mid) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Medorder medorder1 = em.find(Medorder.class, mid);

		return medorder1;
	}

	public boolean deleteMedorder(int mid) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Medorder medorder1 = em.find(Medorder.class, mid);

		if (medorder1 != null) {
			et.begin();
			em.remove(medorder1);
			et.commit();
			return true;
		} else {
			return false;
		}
	}

	public Medorder updateMedorder(int mid, Medorder medorder) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Medorder medorder1 = em.find(Medorder.class, mid);

		if (medorder1 != null) {
			medorder1.setDname(medorder.getDname());
			medorder1.setOrderDate(medorder.getOrderDate());
			medorder1.setTotal(medorder.getTotal());
			medorder1.setItems(medorder.getItems());
			medorder1.setEncounters(medorder.getEncounters());
			et.begin();
			em.merge(medorder1);
			et.commit();
			return medorder1;
		} else {
			return null;
		}
	}

	public List<Medorder> getAllMedorder() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Query query = em.createQuery("select s from Medorder s");

		List<Medorder> medorder1 = query.getResultList();

		return medorder1;
	}

	public List<Medorder> getMedorderByDoctorname(String name) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Query query = em.createQuery("select s from Medorder s where dname=?1");
		query.setParameter(1, name);

		List<Medorder> medorder1 = query.getResultList();

		return medorder1;
	}

}
