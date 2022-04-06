package com.cg.shopping.service;

import com.cg.shopping.entities.OrderDetails;

public interface IOrderService
{
	public OrderDetails addOrder(OrderDetails order);
	public OrderDetails updateOrder(OrderDetails order);
	public OrderDetails searchOrder(int id);
	public boolean cancelMall(int id);
	//public Item addItem(Item item);
	
	
	
}