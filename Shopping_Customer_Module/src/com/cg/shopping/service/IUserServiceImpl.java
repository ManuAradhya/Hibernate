package com.cg.shopping.service;

import com.cg.shopping.entities.User;
import com.cg.shopping.repository.IUserRepository;
import com.cg.shopping.repository.IUserRepositoryImpl;

public class IUserServiceImpl  implements IUserService {
	private IUserRepository repository;
	public IUserServiceImpl()
	{
		repository=new IUserRepositoryImpl();
	}

	@Override
	public User addUser(User user) {
        repository.beginTransaction();
		
		repository.commitTransaction();
		return null;
	}

	@Override
	public User updateUser(User user) {
        repository.beginTransaction();
		
		repository.commitTransaction();
		return null;
	}

	@Override
	public User login(User user) {
        repository.beginTransaction();
		
		repository.commitTransaction();
		return null;
	}

	@Override
	public boolean logOut() {
        repository.beginTransaction();
		
		repository.commitTransaction();
		return false;
	}

}