package pl.mazurmarcin.javastart.lecture9;

public class Company {

	public static void main(String[] args) {

		Employee employee = new Employee("Marcin", "Mazur", "52-358 Wrocław", "63253256358", 4500.50);
		Customer customer = new Customer("Michał", "Zawadzki", "55-411 Wrocław", "856598568", -19.99);
		Director director = new Director("Antoni", "Kabański", "60-311 Poznań", "5235698523", 12000, 6000);

		System.out.println(employee);
		System.out.println(customer);
		System.out.println(director);

		Director director2 = new Director("Antoni", "Kabański", "60-311 Poznań", "5235698523", 12000);
		System.out.println(director2);

		System.out.println("\n\n");

		employee.printInfo();
		System.out.println();
		
		customer.printInfo();
		System.out.println();
		
		director.printInfo();		
		System.out.println();

	}

}
