package com.cg.shopping.service;

import java.util.List;

import com.cg.shopping.entity.Customer;
import com.cg.shopping.repository.ICustomerRepository;
import com.cg.shopping.repository.ICustomerRepositoryImpl;


public class ICustomerServiceImpl implements ICustomerService {

	
	
	private ICustomerRepository dao;
	
	public ICustomerServiceImpl() 
	{
		dao=new ICustomerRepositoryImpl();
	}
	
	
	@Override
	public Customer orderItem(Customer item) {
		dao.beginTransaction();
		dao.addCustomer(item);
		dao.commitTransaction();
		return item;
	}

	

	@Override
	public Customer searchMall(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean cancelOrder(int orderId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Customer login(Customer user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean logout() {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public List<Customer> searchItem(int id) {
		dao.beginTransaction();
	Customer customer=dao.searchCustomerByid(id);
	dao.commitTransaction();
		return (List<Customer>) customer;
	}


}
