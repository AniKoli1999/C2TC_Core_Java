package com.cg.smms.repository;

import javax.persistence.EntityManager;

import com.cg.smms.entities.Item;

public class ItemRepositoryImpl implements IItemRepository {

	
private EntityManager entityManager;
	
	// step 1 : start JPA LifeCycle

	public ItemRepositoryImpl() 
	{
		entityManager =JPAUtil.getEntityManager();
	}

	//1st Crud Operation- Create Operation in repository
	@Override
	public Item addItem(Item item)
	{
		// TODO Auto-generated method stub
		entityManager.persist(item);
		return item;
	}

	@Override
	public Item updateItem(Item item)
	{
		// TODO Auto-generated method stub
		entityManager.merge(item);
		return item;
	}

	@Override
	public Item searchItem(int id) {
		// TODO Auto-generated method stub
		Item item = entityManager.find(Item.class, id);
		return item;
	}

	

	@Override
	public boolean deleteItem(int id) {
		// TODO Auto-generated method stub
		Item item = entityManager.find(Item.class,id);
		entityManager.remove(item);
		return false;
	}
	
	@Override
	public void beginTransaction() 
	{
		// TODO Auto-generated method stub
		entityManager.getTransaction().begin();;
	}

	@Override
	public void commitTransaction() 
	{
		// TODO Auto-generated method stub
		entityManager.getTransaction().commit();
	}


}
