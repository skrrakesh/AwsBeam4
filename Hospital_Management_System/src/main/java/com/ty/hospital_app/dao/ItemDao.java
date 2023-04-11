package com.ty.hospital_app.dao;

import java.util.List;

import com.ty.hospital_app.dto.Item;

public interface ItemDao {
public Item saveItem(int itemId,Item item);
	
	public Item getItemId(int itemId);
	
	public boolean deleteItemId(int itemId);
	
	public Item updateItemId(int itemId,Item item);
	
	public List<Item> getAllItems();

}
