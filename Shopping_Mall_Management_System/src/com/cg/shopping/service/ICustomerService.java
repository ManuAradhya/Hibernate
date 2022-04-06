package com.cg.shopping.service;

import java.util.List;


import com.cg.shopping.entities.Customer;


public interface ICustomerService {
	public Customer orderItem(Customer item);
	public List<Customer> searchItem(int id);
	public Customer searchMall(int id);
	public boolean cancelOrder(int orderId);
	public Customer login(Customer user);
	public boolean logout();
}
