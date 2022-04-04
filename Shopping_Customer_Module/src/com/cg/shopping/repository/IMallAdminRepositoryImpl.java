package com.cg.shopping.repository;

import javax.persistence.EntityManager;
import com.cg.shopping.entities.MallAdmin;

public class IMallAdminRepositoryImpl implements IMallAdminRepository {
	private EntityManager entityManager;
	public IMallAdminRepositoryImpl()
	{
		entityManager=JPAUtil.getEntityManager();
	}

	public MallAdmin addMallAdmin(MallAdmin mallAdmin) {
		entityManager.persist(mallAdmin);
		return mallAdmin;
	}

	public MallAdmin updateMallAdmin(MallAdmin mallAdmin) {
		MallAdmin update = entityManager.merge(mallAdmin);
		return update;
	}

	public MallAdmin deleteMallAdmin(long id) {
		entityManager.remove(id);
		return null;
	}

	public MallAdmin searchMallAdmin(long id) {
		entityManager.find(MallAdmin.class, id);
		return null;
	}

	public void beginTransaction() {
		entityManager.getTransaction().begin();
	}

	public void commitTransaction() {
		entityManager.getTransaction().commit();
		
	}
}