package com.cg.shopping.repository;

import javax.persistence.EntityManager;

import com.cg.shopping.entity.Customer;

public class ICustomerRepositoryImpl implements ICustomerRepository {

	
	private EntityManager entitymanager;
	
	
	
	public ICustomerRepositoryImpl()
	{
		entitymanager= JPAUtil.getEntityManager();
	}

	@Override
	public Customer addCustomer(Customer customer) {
		entitymanager.persist(customer);
		return customer;
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		entitymanager.merge(customer);
		return customer;
	}

	@Override
	public Customer searchCustomerByid(int id) {
		Customer customer=entitymanager.find(Customer.class, id);
		return customer;
	}



	@Override
	public Customer searchCustomerByname(String name) {
		Customer customer=entitymanager.find(Customer.class, name);
		return customer;
	}

	@Override
	public Customer deleteCustomerByid(int id) {
		Customer customer=entitymanager.find(Customer.class, id);
		entitymanager.remove(customer);
		return customer;
	}

	@Override
	public void beginTransaction() {
entitymanager.getTransaction().begin();
		
	}

	@Override
	public void commitTransaction() {
entitymanager.getTransaction().commit();
		
	}

	
	
}
