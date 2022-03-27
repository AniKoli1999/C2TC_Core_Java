package com.cg.smms.client;

import com.cg.smms.entities.*;
import com.cg.smms.service.*;

public class DeleteOp {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		Employee employee = new Employee();
		Item item = new Item();
		Mall mall = new Mall();
		MallAdmin malladmin = new MallAdmin();
		OrderDetails orderdetails = new OrderDetails();
		Shop shop = new Shop();
		ShopOwner shopowner = new ShopOwner();
		User user = new User();
		
		IAdminService a_service = new IAdminServiceImpl();
		ICustomerService c_service = new ICustomerServiceImpl();
		IEmployeeService e_service = new IEmployeeServiceImpl();
		IOrderService o_service = new IOrderServiceImpl();
		IShopService s_service = new IShopServiceImpl();
		IUserService u_service = new IUserServiceImpl();
		
		shop = s_service.searchShopById(301);
		s_service.deleteShop(301);
		
		employee = e_service.searchEmployee(10);
		e_service.deleteEmployee(10);
		
		user = u_service.searchUser(47);
		u_service.deleteUser(47);
		
		customer = c_service.searchCustomer(45);
		c_service.deleteCustomer(45);
		
		orderdetails = o_service.searchOrder(10001);
		o_service.deleteOrder(10001);
		
		item = c_service.searchItem(2111);
		c_service.deleteItem(2111);
		
		
		
		
		

	}

}
