package com.cg.shopping.client;

import com.cg.shopping.entity.Customer;
import com.cg.shopping.service.ICustomerService;
import com.cg.shopping.service.ICustomerServiceImpl;

public class Client {

	public static void main(String[] args) {
Customer cust=new Customer();
cust.setId(1);
cust.setName("Manu");
cust.setOrder_id("AMY1345");
cust.setPhone("8105348845");
cust.setEmail("manuaradhya98@gmail.com");
ICustomerService ics=new ICustomerServiceImpl();
ics.orderItem(cust);

	}

}
