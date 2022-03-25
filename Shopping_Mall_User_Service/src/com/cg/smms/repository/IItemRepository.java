package com.cg.smms.repository;

import com.cg.smms.entities.Item;

public interface IItemRepository {
	public Item addItem(Item item);
	public Item updateItem(Item item);
	public Item searchItem(int id);
	public boolean deleteItem(int id);
	void beginTransaction();
	void commitTransaction();
	
}
