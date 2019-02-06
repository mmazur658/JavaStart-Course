package pl.mazurmarcin.javastart.zadania.kolekcje;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Menu {

	public List<Dish> menu = new ArrayList<>();

	public Menu() {
		fillMenu();
	}

	private void fillMenu() {
		
		menu.add(new Dish(1, "Pizza Margherita", 24.99));
		menu.add(new Dish(2, "Pizza Mafioso", 29.99));
		menu.add(new Dish(3, "Spaghetti Bolognese", 31.99));
		menu.add(new Dish(4, "Spaghetti Carbonara", 26.99));
		menu.add(new Dish(5, "Lasagne", 24.99));
		menu.add(new Dish(6, "Gazpacho", 16.99));
		menu.add(new Dish(7, "Cannelloni ze szpinakiem", 29.99));
		menu.add(new Dish(8, "Bruschetta", 13.99));
		menu.add(new Dish(9, "Tiramisu", 19.99));
		menu.add(new Dish(10, "Panna Cotta", 19.99));
		
	}
	
	public void printMenu() {
		for (Dish dish : menu) 
			System.out.println(dish);		
	}
	
	public List<Dish> convertIdsToDishes(List<Integer> ids){		
		return ids.stream().map(id -> menu.get(id-1)).collect(Collectors.toList());		
	}

}
