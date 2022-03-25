package com.cg.smms.client;

import com.cg.smms.entities.User;
import com.cg.smms.service.IUserService;
import com.cg.smms.service.UserServiceImpl;

public class client {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		User user = new User();
		
		IUserService service =new UserServiceImpl();
	
		
		// CRUD operation calling activity
		//create operation
	   /* user.setId(1000);
		user.setName("waren");
		user.setType("Admin");
		user.setPassword("Admin@47");*/
		
		/*service.addUser(user);
	
		// Retrieve Operation
		user =service.searchUserById(49);
		System.out.println("ID is: "+user.getId());
		System.out.println("Name is: "+user.getName());
		System.out.println("Password is: "+user.getPassword());
		System.out.println("Type is: "+user.getType());*/
		
		

		
				
				// Update Operation
				user  =service.searchUserById(1000);
				user.setName("Rakesh");
				service.updateUser(user);
				
				
				service.searchUserById(1000);
				System.out.println("ID is: "+user.getUserid());
				System.out.println("Name is: "+user.getName());
				
				
			/*	// Delete Operation
				user=service.searchUserById(47);
				service.removeUser(user);
				System.out.println("Row removed");
				service.searchUserById(101);
				System.out.println("ID is: "+user.getUserid());
				System.out.println("Name is: "+user.getName());
				*/
				
	}

}
