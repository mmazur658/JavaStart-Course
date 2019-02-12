package pl.mazurmarcin.javastart.lecture11.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PersonApp {

	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in);) {

			System.out.println("Podaj imię: ");
			String firstName = scanner.nextLine();

			System.out.println("Podaj nazwisko: ");
			String lastName = scanner.nextLine();

			System.out.println("Podaj PESEL: ");
			String pesel = scanner.nextLine();

			System.out.println("Podaj wiek: ");
			int age = scanner.nextInt();

			Person person = new Person(firstName, lastName, age, pesel);
			System.out.println(person);

		} catch (NameUndefinedException exception) {
			System.out.println(exception.getMessage());
		} catch (IncorrectAgeException exception) {
			System.out.println(exception.getMessage());
		} catch (InputMismatchException exception) {
			System.out.println("Nieprawidłowy format dancyh");
		}

	}

}
