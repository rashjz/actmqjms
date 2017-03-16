package rashjz.info.springmvc.service;

import java.util.Map;

import rashjz.info.springmvc.model.InventoryResponse;
import rashjz.info.springmvc.model.Order;

public interface OrderService {
	public void sendOrder(Order order);
	
	public void updateOrder(InventoryResponse response);
	
	public Map<String, Order> getAllOrders();
}
