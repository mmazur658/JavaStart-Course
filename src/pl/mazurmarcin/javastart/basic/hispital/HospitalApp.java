package pl.mazurmarcin.javastart.basic.hispital;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HospitalApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Hospital hospital = new Hospital();

        System.out.println("* * * Witaj w szpitalu * * *\n\n");

        int userInput = 0;
        do {
            System.out.println("Co chcesz zrobić? \n 0 - exit, 1 - add patient, 2 - show list");
            userInput = scanner.nextInt();
            scanner.nextLine();

            switch (userInput) {
                case 1:
                    Patient patient = new Patient();

                    System.out.print("Imię: ");
                    patient.setFirstName(scanner.nextLine());
                    System.out.print("\nNazwisko: ");
                    patient.setLastName(scanner.nextLine());
                    System.out.print("\nPESEL: ");
                    patient.setPesel(scanner.nextLine());
                    hospital.addPatient(patient);
                    break;
                case 2:
                    hospital.showAllPatients();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Nieznane polecenie!");

            }


        } while (userInput != 0);
    }
}
