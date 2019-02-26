package pl.mazurmarcin.javastart.lecture15.homework;

import java.util.List;

public class OrderDB {

	private FileUtils fileUtils = new FileUtils();
	private List<Order> orders;

	public OrderDB() {
		orders = fileUtils.importOrdersFromFile();
	}

	public void exportOrdersToFile() {
		fileUtils.exportOrdersToFile(orders);
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void addOrder(Order order) {
		orders.add(order);
	}

	public Order getSingleOrder(int index) {

		if (index < orders.size())
			return orders.get(index);
		else
			return null;

	}

}
