package com.cg.smms.client;

import com.cg.smms.entities.*;
import com.cg.smms.service.*;

public class ReadOp {

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

		
		customer = c_service.searchCustomer(19);
		System.out.println(
				"Customer Found: " + "ID: " + customer.getId() + "\n" + "Customer Name: " + customer.getName());
		
		employee = e_service.searchEmployee(110);
		System.out.println(
				"Employee Found: " + "ID: " + employee.getId() + "\n" + "Employee Name: " + employee.getName());
	
		item = c_service.searchItem(1111);
		System.out.println(
				"Item Found: " + "ID: " + employee.getId() + "\n" + "Item Name: " + item.getItemName());
		
		orderdetails = o_service.searchOrder(10002);
		System.out.println(
				"Order Found: " + "ID: " + orderdetails.getId() + "\n" + "Order Date: " + orderdetails.getDateOfPurchase());
		
		shop = s_service.searchShopById(302);
		System.out.println(
				"Shop Found: " + "ID: " + shop.getShopId() + "\n" + "Shop Name: " + shop.getShopName());
		
		user = u_service.searchUser(99);
		System.out.println(
				"User Found: " + "ID: " + user.getId() + "\n" + "User Name: " + user.getName());
	}
}
