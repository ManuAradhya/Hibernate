package com.cg.shopping.service;

import java.util.List;

import com.cg.shopping.entities.Item;
import com.cg.shopping.entities.Mall;
import com.cg.shopping.entities.OrderDetails;
import com.cg.shopping.entities.User;
import com.cg.shopping.repository.ICustomerRepository;
import com.cg.shopping.repository.ICustomerRepositoryImpl;

public class ICustomerServiceImpl implements ICustomerService
{
	private ICustomerRepository repository;
	
	public ICustomerServiceImpl() {
		repository=new ICustomerRepositoryImpl();
		
	}

	@Override
	public List<Item> searchItem(String itemName) {
		repository.beginTransaction();
		
		repository.commitTransaction();
		
		return null;
	}
	@Override
	public Item orderItem(Item item) {
		repository.beginTransaction();
		//repository.orderItem(OrderDetails order);
		repository.commitTransaction();
		return null;
	}

	@Override
	public Mall searchMall(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean cancelOrder(long orderId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User login(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean logout() {
		// TODO Auto-generated method stub
		return false;
	}
	
}