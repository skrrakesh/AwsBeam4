package com.ty.hospital_app.service;

import java.util.List;

import com.ty.hospital_app.dao.imp.ItemDaoImp;
import com.ty.hospital_app.dto.Item;

public class ItemService {

	public void saveItem(int itemId, Item item) {
		ItemDaoImp daoimp = new ItemDaoImp();
		Item item1 = daoimp.saveItem(itemId, item);
		if (item1 != null) {
			System.out.println("Data Saved.");
		} else {
			System.out.println("Data not Saved.");
		}
	}

	public Item getItemId(int itemId) {
		ItemDaoImp daoimp = new ItemDaoImp();
		Item item1 = daoimp.getItemId(itemId);
		if (item1 != null) {
			return item1;
		} else {
			return null;
		}
	}

	public void deleteItemId(int itemId) {
		ItemDaoImp daoimp = new ItemDaoImp();
		boolean flag = daoimp.deleteItemId(itemId);

		if (flag) {
			System.out.println("Data Deleted.");
		} else {
			System.out.println("Data not Found.");
		}
	}

	public Item updateItemId(int itemId, Item item) {
		ItemDaoImp daoimp = new ItemDaoImp();
		Item item1 = daoimp.updateItemId(itemId, item);
		if (item1 != null) {
			return item1;
		} else {
			return null;
		}
	}

	public void getAllItems() {
		ItemDaoImp daoimp = new ItemDaoImp();
		List<Item> items = daoimp.getAllItems();
		for (Item item : items) {
			System.out.println(item);
		}
	}
}
