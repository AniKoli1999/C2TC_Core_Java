package com.cg.smms.client;


import java.time.LocalDate;
import com.cg.smms.entities.*;
import com.cg.smms.service.*;

public class UpdateOp {

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

		//Customer
		customer = c_service.searchCustomer(19);
		customer.setName("Satish");
		customer.setPhone("7900560085");
		customer.setEmail("satish@gmail.com");
		
		c_service.updateCustomer(customer);
		
		//Employee
		employee = e_service.searchEmployee(110);
		employee.setName("Rakesh");
		employee.setSalary(50000);
		employee.setAddress("Mumbai");
		employee.setDesignation("Store Manager");
		employee.setDob(LocalDate.of(1995, 02, 01));
		
		e_service.updateEmployee(employee);
		
		//Item
		item = c_service.searchItem(1111);
		item.setItemName("Samsung");
		item.setPrice(25000);
		item.setManufacturingDate(LocalDate.of(2017, 06, 06));
		item.setExpiry(LocalDate.of(2025, 06, 06));
		item.setCategory("MOBILES");
		
		c_service.updateItem(item);
		
		//Order
		orderdetails = o_service.searchOrder(10002);
		orderdetails.setDateOfPurchase(LocalDate.of(2021, 04, 05));
		orderdetails.setTotal(25000);
		orderdetails.setPaymentMode("CASH");
		
		o_service.updateOrder(orderdetails);
		
		//Shop
		shop = s_service.searchShopById(302);
		shop.setShopCategory("WHOLESALE");
		shop.setShopName("SS Electronics");
		shop.setShopStatus("OPEN");
		shop.setLeaseStatus("VALID");
		
		s_service.updateShop(shop);
		
		//User
		user = u_service.searchUser(99);
		user.setName("Atharva");
		user.setType("Prime");
		user.setPassword("Adi@2010");
		
		u_service.updateUser(user);
		
		
	}

}
