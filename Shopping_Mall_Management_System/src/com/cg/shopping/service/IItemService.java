package com.cg.shopping.service;

import com.cg.shopping.entities.Employee;
import com.cg.shopping.entities.Item;

public interface IItemService 
{
	public Item addItem(Item item);

	public void addEmployee(Employee empl);
}