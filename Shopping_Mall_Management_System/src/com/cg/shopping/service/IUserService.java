package com.cg.shopping.service;

import com.cg.shopping.entities.Employee;
import com.cg.shopping.entities.Item;
import com.cg.shopping.entities.OrderDetails;
import com.cg.shopping.entities.Shop;
import com.cg.shopping.entities.User;

public interface IUserService
{
	public User addUser1(OrderDetails order);
	public User updateUser(User user);
	
	public User login(User user);
	public boolean logOut();
	public void addItem(Item item);
	public void addUser(OrderDetails order);
	
	public void addOrder(User user);
	//public void addOrder1(OrderDetails order);
	public User addUser(User user);
	public void addEmployee(Employee empl);
	public void addShop(Shop shop);
	
}