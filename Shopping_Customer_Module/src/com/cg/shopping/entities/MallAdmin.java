package com.cg.shopping.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mallAdmin")
public class MallAdmin {
	@Id
	@Column(name="id")
private long id;
	
	@Column(name="name")
private String name;
	
	@Column(name="password")
private String password;
	
	@Column(name="mall")
private Mall mall;
	
	@Column(name="phone")
private long phone;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Mall getMall() {
		return mall;
	}

	public void setMall(Mall mall) {
		this.mall = mall;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public MallAdmin(long id, String name, String password, Mall mall, long phone) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.mall = mall;
		this.phone = phone;
	}

	public MallAdmin() {
		
	}

	@Override
	public String toString() {
		return "MallAdmin [id=" + id + ", name=" + name + ", password=" + password + ", mall=" + mall + ", phone="
				+ phone + "]";
	}
	
	
}