package pl.mazurmarcin.javastart.lecture15.homework;

import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class OnlineStore {

	private OnlineStoreService onlineStoreService = new OnlineStoreService();
	private Scanner scanner = new Scanner(System.in);

	public void runOnlineStore() {

		int userInput = 999;
		System.out.println("Witaj w sklepie. Wybierz jedną z poniższych opcji: ");

		do {

			printMainOptions();
			userInput = getCorrectInt();
			OnlineStoreMainMenu onlineStoreMainMenu = OnlineStoreMainMenu.findByValue(userInput);

			if (onlineStoreMainMenu != null) {
				switch (onlineStoreMainMenu) {
				case SORT:
					sort();
					break;
				case CHANGE_STATUS:
					changeStatus();
					break;
				case ADD_ORDER:
					addNewOrder();
					break;
				case EXIT:
					sayGoodBye();
					break;
				default:
					System.out.println("Wybór nieznany - spóbuj ponownie");
				}
			} else
				System.out.println("Wybór nieznany - spóbuj ponownie");

		} while (userInput != OnlineStoreMainMenu.EXIT.getValue());

	}

	public void printMainOptions() {
		System.out.println(OnlineStoreMainMenu.SORT.getValue() + " - Sortowanie i  wyświetlenie listy");
		System.out.println(OnlineStoreMainMenu.CHANGE_STATUS.getValue() + " - Zmiana statusu");
		System.out.println(OnlineStoreMainMenu.ADD_ORDER.getValue() + " - Dodawanie zamówienia");
		System.out.println(OnlineStoreMainMenu.EXIT.getValue() + " - Koniec");
	}

	public void printSortOptinos() {
		System.out.println("\nWybierz typ sortowania: ");
		System.out.println(ComparatorType.SORT_BY_NAME.getIndex() + " - sortuj po nazwie");
		System.out.println(ComparatorType.SORT_BY_PRICE.getIndex() + " - sortuj po cenie");
		System.out.println(ComparatorType.SORT_BY_STATUS.getIndex() + " - sortuj po statusie");
	}

	public void printList(List<Order> orders) {
		for (int i = 0; i < orders.size(); i++)
			System.out.println((i + 1) + " - " + orders.get(i));
	}

	@SuppressWarnings("unchecked")
	private void sort() {
		printSortOptinos();
		ComparatorType comparator = getComparator();

		if (comparator != null) {
			List<Order> orders = onlineStoreService.getSortedList(comparator.getComparator());
			printList(orders);
		} else
			System.out.println("Typ sortowania nieznany");

	}

	private void addNewOrder() {

		System.out.println("Dodawanie nowego zamówienia . . .");
		System.out.println("Podaj id: ");
		int id = getCorrectInt();

		scanner.nextLine();
		System.out.println("Podaj nazwę: ");
		String name = scanner.nextLine();

		System.out.println("Podaj cenę: ");
		double price = getCorrectDouble();

		onlineStoreService.createNewOrder(id, name, price);
		System.out.println("Zamówienie zostało dodane");
	}

	private void sayGoodBye() {
		System.out.println("Do zobaczenia!");
		onlineStoreService.cleanTheFloorAndCloseTheDoor();
		scanner.close();
	}

	private void changeStatus() {

		System.out.println("Podaj index zamówienia do zmiany: ");
		int index = getCorrectInt();
		Order order = onlineStoreService.getSingleOrder(index);

		if (order == null)
			System.out.println("Brak zamówienia o podanym indexie.");
		else {
			OrderStatus newOrderStatus = getOrderStatus();
			OrderStatus orderStatus = order.getStatus();
			if (newOrderStatus == OrderStatus.CANCELLED) {

				if (orderStatus == OrderStatus.CANCELLED || orderStatus == OrderStatus.COLLECTED
						|| orderStatus == OrderStatus.READY_TO_DISPATCH) {

					order.setStatus(newOrderStatus);
					System.out.println("Status został zmieniony");

				} else {
					System.out.println("Nie można zmienić statusu");
				}

			} else {
				order.setStatus(newOrderStatus);
				System.out.println("Status został zmieniony");
			}

			orderDB.getSingleOrder(index).setStatus(newOrderStatus);
		}

	}

	public int getCorrectInt() {

		int number = 0;
		boolean isNumberInt = false;

		do {
			try {
				number = scanner.nextInt();
				isNumberInt = true;
			} catch (InputMismatchException exception) {
				System.out.println("Nieprawidłowy format danych");
				scanner.nextLine();
			}
		} while (!isNumberInt);

		return number;

	}

	public double getCorrectDouble() {

		double number = 0;
		boolean isNumberDouble = false;

		do {
			try {
				number = scanner.nextDouble();
				isNumberDouble = true;
			} catch (InputMismatchException exception) {
				System.out.println("Nieprawidłowy format danych");
				scanner.nextLine();
			}
		} while (!isNumberDouble);

		return number;
	}

	public ComparatorType getComparator() {

		int userInput = getCorrectInt();
		ComparatorType comparatorType = ComparatorType.findByIndex(userInput);
		return comparatorType;

	}

	public OrderStatus getOrderStatus() {
		
		System.out.println("Dostępne statusy: ");
		for (OrderStatus status : OrderStatus.values())
			System.out.println((status.ordinal()+1)+" - "+status);
		
		OrderStatus orderStatus = null;
		int userInput = 0;
		
		do {
			
			userInput = getCorrectInt()-1;
			
			for (OrderStatus status : OrderStatus.values()) {
				if(status.ordinal()==)
			}
				
			
			
		} while (orderStatus == null);
		



		do {
			orderStatuName = nextLine().toUpperCase();
			orderStatus = OrderStatus.valueOf(orderStatuName);

			if (orderStatus == null)
				System.out.println("Status nierozpoznany - wpisz ponownie");

		} while (orderStatus == null);

		return orderStatus;
	}

}
