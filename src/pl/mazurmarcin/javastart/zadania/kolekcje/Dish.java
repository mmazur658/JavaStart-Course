package pl.mazurmarcin.javastart.zadania.kolekcje;

public class Dish {

	private String dishName;
	private int id;
	private double price;

	public Dish(int id, String dishName, double price) {
		this.dishName = dishName;
		this.id = id;
		this.price = price;
	}

	public String getDishName() {
		return dishName;
	}

	public void setDishName(String dishName) {
		this.dishName = dishName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return id + ", " + dishName + ", cena: " + price + " PLN";
	}

}
