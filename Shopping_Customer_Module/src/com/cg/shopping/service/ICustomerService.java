package com.cg.shopping.service;

import java.util.List;

import com.cg.shopping.entities.Item;
import com.cg.shopping.entities.Mall;
import com.cg.shopping.entities.User;

public interface ICustomerService {
public Item orderItem(Item item);
public List<Item> searchItem(String itemName);
public Mall searchMall(long id);
public boolean cancelOrder(long orderId);
public User login(User user);
public boolean logout();
}