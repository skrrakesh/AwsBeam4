package com.ty.hospital_app.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.ty.hospital_app.dao.ItemDao;
import com.ty.hospital_app.dto.Item;

public class ItemDaoImp implements ItemDao {

	public Item saveItem(int itemId, Item item) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Item item1 = em.find(Item.class, itemId);

		if (item != null) {
			et.begin();
			em.persist(item1);
			et.commit();
			return item1;
		} else {
			return null;
		}
	}

	public Item getItemId(int itemId) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Item items = em.find(Item.class, itemId);

		return items;
	}

	public boolean deleteItemId(int itemId) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Item items = em.find(Item.class, itemId);

		if (items != null) {
			et.begin();
			em.remove(items);
			et.commit();
			return true;
		} else {
			return false;
		}
	}

	public Item updateItemId(int itemId, Item item) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("vikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Item items = em.find(Item.class, itemId);

		if (items != null) {
			items.setCost(item.getCost());
			items.setName(item.getName());
			items.setQuantity(item.getQuantity());
			et.begin();
			em.merge(items);
			et.commit();
			return items;
		} else {
			return null;
		}
	}

	public List<Item> getAllItems() {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("avikas");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

		Query query = em.createQuery("select s from Items s");

		List<Item> items = query.getResultList();

		return items;
	}

}
