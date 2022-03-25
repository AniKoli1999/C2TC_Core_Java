package com.cg.smms.service;

import com.cg.smms.entities.User;
import com.cg.smms.repository.IUserRepository;
import com.cg.smms.repository.UserRepositoryImpl;
import com.mysql.cj.Query;
import com.mysql.cj.Session;


public class UserServiceImpl implements IUserService 
{
	//calling Iuser object for this object creating implementing connection & using constructor of the existing class in implementaion mapping in both 
	//Step -1 :Establishing connection between Service & Repository
	private IUserRepository dao;
	
	public UserServiceImpl() 
	{
		
		//dao is a access of every method implemnts in repository interface
		dao = new UserRepositoryImpl(); 
	}

	// Step -2: Service Call to perform CRUD Operation
	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		
		dao.beginTransaction();
		dao.addUser(user);
		dao.commitTransaction();

		return user;
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		dao.beginTransaction();
		dao.updateUser(user);
		dao.commitTransaction();
		
		return user;
	}

	@Override
	public User login(User user) 
	{
		return user;
		// TODO Auto-generated method stub
		
		/*User loginUser(User user1);
		 {
		  // TODO Login
		  Object factory;
		Session session = ((User) factory).getCurrentSession();
		  
		
		{
		  Query query = ((User) session).createQuery("from User where userName =userName and password =password",User.class);
		  ((User) query).setParameter("userName", user1.getName());
		  ((User) query).setParameter("password", user1.getPassword());
		  
		user1 = ((User) query).getSingleResult();
		  return user1;
		  }
		 }*/
	}

	@Override
	public boolean logOut() 
	{
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User searchUserById(int id) 
	{
		User user = dao.searchUserById(id);
		return user;
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeUser(User user) {
		// TODO Auto-generated method stub
		
	}

}
