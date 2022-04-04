package com.cg.shopping.repository;

import com.cg.shopping.entities.User;


public class IUserRepository 
{
	public User addUser(User user);
	public User updateUser(User user);
	public User deleteUser(long id);
	
	public abstract void commitTransaction();
	public abstract void beginTransaction();
}