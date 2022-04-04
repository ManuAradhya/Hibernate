package com.cg.shopping.client;

import com.cg.shopping.service.ICustomerService;
import com.cg.shopping.service.ICustomerServiceImpl;

public class Client {

	public static void main(String[] args) {
		ICustomerService customerservice=new ICustomerServiceImpl();
		customerservice.cancelOrder(2);
		
	
	}
}
