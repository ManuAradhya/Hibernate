package com.cg.shopping.service;
import com.cg.shopping.entities.Employee;
import com.cg.shopping.entities.Item;
import com.cg.shopping.entities.OrderDetails;
import com.cg.shopping.entities.Shop;
import com.cg.shopping.entities.User;
import com.cg.shopping.repository.IUserRepository;
import com.cg.shopping.repository.UserRepositoryImpl;
//import com.cg.shopping.repository.UserRepositoryImpl;

public class UserServiceImpl implements IUserService

{
	// Step 1: Establishing connection between Service and Repo
	private IUserRepository dao;
	public UserServiceImpl() 
	{
		dao = new UserRepositoryImpl();
	}
	// Step 2: Service calls to perform CRUD Operation
	public User addUser(User user) {
        dao.beginTransaction();
		dao.addUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User updateUser(User user) {
        dao.beginTransaction();
		dao.updateUser(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public User login(User user) {
        dao.beginTransaction();
		//dao.login(user);
		dao.commitTransaction();
		return user;
	}

	@Override
	public boolean logOut() {
        dao.beginTransaction();
	    //dao.logout(null);
		dao.commitTransaction();
		return false;
	}
	@Override
	public void addItem(Item item) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public User addUser1(OrderDetails order) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void addUser(OrderDetails order) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addOrder(User user) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addEmployee(Employee empl) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void addShop(Shop shop) {
		// TODO Auto-generated method stub
		
	}
	
	
}