package com.cg.shopping.repository;

import com.cg.shopping.entities.MallAdmin;

public interface IMallAdminRepository {
	public MallAdmin addMallAdmin(MallAdmin mallAdmin);
	public MallAdmin updateMallAdmin(MallAdmin mallAdmin);
	public MallAdmin deleteMallAdmin(long id);
	public MallAdmin searchMallAdmin(long id);
	
	public abstract void beginTransaction();
	public abstract void commitTransaction();
}