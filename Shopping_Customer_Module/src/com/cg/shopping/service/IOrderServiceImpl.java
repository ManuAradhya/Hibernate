package com.cg.shopping.service;


	import com.cg.shopping.entities.Item;
	import com.cg.shopping.entities.OrderDetails;
import com.cg.shopping.repository.IOrderRepository;
import com.cg.shopping.repository.IOrderRepositoryImpl;

	public class IOrderServiceImpl  implements IOrderService{
		
		private IOrderRepository repository;

		public IOrderServiceImpl() {
			repository=new IOrderRepositoryImpl();
		}

		@Override
		public OrderDetails addOrder(OrderDetails order) {
			repository.beginTransaction();
			
			repository.commitTransaction();

			return null;
		}

		@Override
		public OrderDetails updateOrder(OrderDetails order) {
			repository.beginTransaction();
			
			repository.commitTransaction();

			return null;
		}

		@Override
		public OrderDetails searchOrder(long id) {
			repository.beginTransaction();
			
			repository.commitTransaction();

			return null;
		}

		@Override
		public boolean cancelMall(long id) {
			repository.beginTransaction();
			
			repository.commitTransaction();

			return false;
		}

		@Override
		public Item addItem(Item item) {
			repository.beginTransaction();
			
			repository.commitTransaction();

			return null;
		}
		

	}
