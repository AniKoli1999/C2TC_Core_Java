package com.cg.smms.repository;

import com.cg.smms.entities.Item;

public interface IItemRepository {
	public Item addItem(Item item);
	public Item updateItem(Item item);
	public Item searchItem(int id);
	public Item deleteItem(int id);
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();
}
