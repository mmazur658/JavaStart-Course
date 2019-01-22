package pl.mazurmarcin.javastart.lecture5;

public class DaysController {
	
	public boolean isWorkingDay(int number) {
		return (number >= 1 && number <= 5 );
	}
	
	public void printStatus(int number) {
		if (isWorkingDay(number))
			System.out.println("dzieñ roboczy.");
		else
			System.out.println("weekend.");
		
	}

	public void showMessage(int number) {
			
		switch(number) {
		case 1:
			System.out.print("Poniedzia³ek to: ");
			printStatus(number);
			break;
		case 2:
			System.out.print("Wtorek to: ");
			printStatus(number);
			break;
		case 3:
			System.out.print("Œroda to: ");
			printStatus(number);
			break;
		case 4:
			System.out.print("Czwartek to: ");
			printStatus(number);
			break;
		case 5:
			System.out.print("Pi¹tek to: ");
			printStatus(number);
			break;
		case 6:
			System.out.print("Sobota to: ");
			printStatus(number);
			break;
		case 7:
			System.out.print("Niedziela to: ");
			printStatus(number);
			break;
		default: 	
			System.out.println("Niepoprawny numer dnia. Wprowadz wartoœæ miêdzy 1 - 7");
		}
		
	}

}
