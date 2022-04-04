package com.cg.shopping.service;

import com.cg.shopping.entities.User;

public class IUserService {
	public User addUser(User user);
	public User updateUser(User user);
	public User login(User user);
	public boolean logOut();
}