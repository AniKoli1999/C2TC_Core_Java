package com.cg.smms.repository;

import javax.persistence.EntityManager;

import com.cg.smms.entities.User;

public class UserRepositoryImpl implements IUserRepository
{
	private EntityManager entityManager;
	
	// step 1 : start JPA LifeCycle

	public UserRepositoryImpl() 
	{
		entityManager =JPAUtil.getEntityManager();
	}

	//1st Crud Operation- Create Operation in repository
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		entityManager.persist(user);
		return user;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		entityManager.merge(user);
		return user;
	}

	@Override
	public boolean deleteUser(int id) {
		// TODO Auto-generated method stub
		User user = entityManager.find(User.class,id);
		entityManager.remove(user);
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

	@Override
	public User searchUserById(int id) 
	{
		User user = entityManager.find(User.class, id);
		// TODO Auto-generated method stub
		return user;
	}
	
	

}
