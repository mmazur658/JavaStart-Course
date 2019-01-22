package pl.mazurmarcin.javastart.lecture5;

import java.util.Scanner;

public class UserManager {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		User user = new User();
		
		System.out.println("Podaj imiê: ");
		user.setFirstName(scanner.nextLine());
		
		System.out.println("Podaj nazwisko: ");
		user.setLastName(scanner.nextLine());
		
		System.out.println("Podaj pesel: ");
		user.setPesel(scanner.nextLine());
		
		System.out.println("Podaj wiek: ");
		user.setAge(scanner.nextInt());
		
		System.out.println(user);
		
		scanner.close();
		
		
	}

}
