package com.cg.shopping.repository;

import com.cg.shopping.entities.Customer;

public interface ICustomerRepository {

	public Customer addCustomer(Customer customer);
	public Customer updateCustomer(Customer customer);
	public Customer searchCustomerByname(String name);
	public Customer deleteCustomerByid(int id);
	public Customer searchCustomerByid(int id);
	public abstract void beginTransaction();
	public abstract void commitTransaction();
	
}
