package com.cg.smms.service;

import com.cg.smms.entities.Employee;
import com.cg.smms.entities.Item;

import com.cg.smms.entities.Shop;
import com.cg.smms.repository.IShopRepository;
import com.cg.smms.repository.IShopRepositoryImpl;
import com.cg.smms.repository.IEmployeeRepository;
import com.cg.smms.repository.IEmployeeRepositoryImpl;
import com.cg.smms.repository.IItemRepository;
import com.cg.smms.repository.IItemRepositoryImpl;


public class IShopServiceImpl implements IShopService{
	
private IShopRepository dao;
private IEmployeeRepository cao;
private IItemRepository bao;

	public IShopServiceImpl()
	{
		dao = new IShopRepositoryImpl();
		cao = new IEmployeeRepositoryImpl();
		bao = new IItemRepositoryImpl();
	}



	@Override
	public Shop addShop(Shop shop) {
		dao.beginTransaction();
		dao.addShop(shop);
		dao.commitTransaction();
		return shop;
	}

	@Override
	public Shop updateShop(Shop shop) {
		dao.beginTransaction();
		dao.updateShop(shop);
		dao.commitTransaction();
		return shop;
	}

	@Override
	public Shop searchShopById(int id) {
		Shop shop = dao.searchShopById(id);
		return shop;
	}

	@Override
	public boolean deleteShop(int id) {
		dao.beginTransaction();
		dao.deleteShop(id);
		dao.commitTransaction();
		return false;
	}

	@Override
	public boolean addEmployee(Employee employee) {
		cao.beginTransaction();
		cao.addEmployee(employee);
		cao.commitTransaction();
		return true;
	}

	@Override
	public boolean updateEmployee(Employee employee) {
		cao.beginTransaction();
		cao.updateEmployee(employee);
		cao.commitTransaction();
		return true;
	}

	@Override
	public Item addItem(Item item) {
		bao.beginTransaction();
		bao.addItem(item);
		bao.commitTransaction();
		return item;
	}


}
