package rashjz.info.springmvc.service;

import java.util.Map;

import rashjz.info.springmvc.model.Order;

public interface OrderRepository {

	public void putOrder(Order order);
	
	public Order getOrder(String orderId);
	
	public Map<String, Order> getAllOrders();
}
