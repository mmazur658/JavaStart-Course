package pl.mazurmarcin.javastart.lecture14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class CustomerBase {
	
	private static final String FILE_NAME = "customer.txt";
	private Map<Integer, Customer> map = new HashMap<>();
	
	public CustomerBase() {
		this.map = readMapWithCustomers();
	}
	
	private Map<Integer, Customer> readMapWithCustomers() {

		Map<Integer, Customer> map = new HashMap<>();
		File file = new File(FILE_NAME);

		try (BufferedReader bf = new BufferedReader(new FileReader(file))) {

			String line = null;
			String[] tempArr = null;
			Customer customer = null;

			while ((line = bf.readLine()) != null) {

				tempArr = line.split(";");
				customer = new Customer(Integer.parseInt(tempArr[0]), tempArr[1], tempArr[2], tempArr[3]);
				map.put(customer.getId(), customer);

			}

		} catch (FileNotFoundException exception) {
			System.out.println("Plik nie został odnaleziony");
		} catch (IOException exception) {
			System.out.println("Błąd odczytu danych");
		}

		return map;
	}
	
	public Customer findById(int id) {
		
		Customer customer = map.get(id);
		
		if(customer==null)
			throw new NullPointerException("Customer doesn`t exist");
		
		return customer;
	}
	
	public void addCustomer(Customer customer) {
		this.map.put(customer.getId(), customer);
		
	}

	public Map<Integer, Customer> getMap() {
		return map;
	}
	
	
	


}
