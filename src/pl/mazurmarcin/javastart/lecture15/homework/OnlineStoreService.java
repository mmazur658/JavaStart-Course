package pl.mazurmarcin.javastart.lecture15.homework;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OnlineStoreService {

	private OrderDB orderDB = new OrderDB();

	public void cleanTheFloorAndCloseTheDoor() {
		orderDB.exportOrdersToFile();
	}

	public void createNewOrder(int id, String name, double price) {
		Order order = new Order(id, name, price);
		orderDB.addOrder(order);
	}

	public List<Order> getSortedList(Comparator<Order> comparator) {
		List<Order> orders = orderDB.getOrders();
		Collections.sort(orders, comparator);
		return orders;
	}

	public Order getSingleOrder(int index) {
		if ((index - 1) < orderDB.getOrders().size())
			return orderDB.getSingleOrder(index);
		else
			return null;
	}

}
