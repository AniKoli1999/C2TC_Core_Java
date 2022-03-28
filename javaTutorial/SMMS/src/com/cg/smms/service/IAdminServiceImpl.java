package com.cg.smms.service;

import com.cg.smms.entities.Shop;
import com.cg.smms.entities.User;
import com.cg.smms.repository.IShopRepository;
import com.cg.smms.repository.IShopRepositoryImpl;
import com.cg.smms.repository.IUserRepository;
import com.cg.smms.repository.IUserRepositoryImpl;

public class IAdminServiceImpl implements IAdminService {
	//Establishing connection between Service and Repository
		 private IShopRepository dao;
		 private IUserRepository cao;
		 
		public IAdminServiceImpl() 
		{
			dao = new IShopRepositoryImpl();
			cao = new IUserRepositoryImpl();
			
		}

	@Override
	public boolean approveNewShop(Shop shop) {
		dao.beginTransaction();
		dao.addShop(shop);
		dao.commitTransaction();
		return true;
	}

	@Override
	public User updateUser(User user) {
		cao.beginTransaction();
		cao.updateUser(user);
		cao.commitTransaction();
		return user;
	}

}
