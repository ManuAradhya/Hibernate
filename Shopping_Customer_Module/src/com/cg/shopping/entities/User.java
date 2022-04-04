package com.cg.shopping.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User 

{
		
	@Id 
	@Column(name="id")
    private long id;
	
	@Column(name="name")
private String name;
	
	@Column(name="type")	
private String type;
	
	@Column(name="password")
private String password;
	
	@Column(name="user_id")
	private String user_id;
	
	public User(long id, String name, String type, String password) {
		
		this.id = id;
		this.name = name;
		this.type = type;
		this.password = password;
	}

	public User() {
		
	}

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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	/*public Customer getCust_id() {
		return cust_id;
	}
	public void setCust_id(Customer cust_id) {
		this.cust_id = cust_id;
	}
	@Override
	public String toString() {
		return "User [cust_id=" + cust_id + ", id=" + id + ", name=" + name + ", type=" + type + ", password="
				+ password + "]";
	}
*/
	
	
}