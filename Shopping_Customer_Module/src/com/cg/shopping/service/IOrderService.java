package com.cg.shopping.service;
import com.cg.shopping.entities.Item;
import com.cg.shopping.entities.OrderDetails;

public interface IOrderService  {
	public OrderDetails addOrder(OrderDetails order);
	public OrderDetails updateOrder(OrderDetails order);
	public OrderDetails searchOrder(long id);
	public boolean cancelMall(long id);
	public Item addItem(Item item);

}