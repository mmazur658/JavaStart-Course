package pl.mazurmarcin.javastart.lecture5;

public class Ifologia {

	public static void main(String[] args) {

		int number = -5;
		int result = number % 2;

		switch (result) {
		case 0:
			System.out.printf("Liczba %d jest parzysta", number);
			break;
		case 1:
			System.out.printf("Liczba %d jest nieparzysta", number);
			break;
		default: 
			System.out.printf("Liczba %d jest ujemna i nieparzysta", number);
		}
		
		System.out.println();

	}
}
