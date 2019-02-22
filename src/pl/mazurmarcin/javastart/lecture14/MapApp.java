package pl.mazurmarcin.javastart.lecture14;

public class MapApp {

	public static void main(String[] args) {

		CustomerUI customerUI = new CustomerUI();
		customerUI.printKeySet();
		customerUI.printAllCustomers();
		customerUI.printCustomer(customerUI.getUserInput());

	}

}
