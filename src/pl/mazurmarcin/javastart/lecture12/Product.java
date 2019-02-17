package pl.mazurmarcin.javastart.lecture12;

import java.io.Serializable;

public class Product implements Serializable {

	private static final long serialVersionUID = 5871728269347062093L;
	
	private String name;
	private String producent;
	private double price;

	public Product(String name, String producent, double price) {
		this.name = name;
		this.producent = producent;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProducent() {
		return producent;
	}

	public void setProducent(String producent) {
		this.producent = producent;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String toCsv() {
		return name + ";" + producent + ";" + price;
	}

	@Override
	public String toString() {
		return "Nazwa: " + name + ", prod:  " + producent + ", cena: " + price;
	}

}
