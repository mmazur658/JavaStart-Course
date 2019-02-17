package pl.mazurmarcin.javastart.lecture12.homework.task12_1;

public class Product {

	private String name;
	private String producer;
	private double price;

	public Product(String name, String producer, double price) {
		this.name = name;
		this.producer = producer;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Nazwa: " + name + ", prod: " + producer + ", cena: " + price;
	}

	public String toCsv() {
		return name + ";" + producer + ";" + price;
	}

}
