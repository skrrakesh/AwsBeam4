package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.EncounterDao;
import com.ty.hospital_app.dto.Branch;
import com.ty.hospital_app.dto.Encounter;

public class EncounterDaoImp implements EncounterDao {

	public Encounter saveEncounter(int bid, Encounter encounter) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Branch branch = em.find(Branch.class, bid);

		if (branch != null) {
			et.begin();
			em.persist(encounter);
			et.commit();
			return encounter;
		} else {
			return null;
		}
	}

	public Encounter getEncounter(int eid) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Encounter encounter = em.find(Encounter.class, eid);

		return encounter;
	}

	public boolean deleteEncounter(int eid) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Encounter encounter = em.find(Encounter.class, eid);

		if (encounter != null) {
			et.begin();
			em.remove(encounter);
			et.commit();
			return true;
		} else {
			return false;
		}
	}

	public Encounter updateEncounter(int eid, Encounter encounter) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Encounter encounter1 = em.find(Encounter.class, eid);

		if (encounter1 != null) {
			encounter1.setDate(encounter.getDate());
			encounter1.setDischarge(encounter.getDischarge());

			et.begin();
			em.merge(encounter1);
			et.commit();
			return encounter1;
		} else {
			return null;
		}
	}

	public List<Encounter> getAllEncounter() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("ambika");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Query query = em.createQuery("select s from Encounter s");

		List<Encounter> encounter = query.getResultList();

		return encounter;
	}

}
