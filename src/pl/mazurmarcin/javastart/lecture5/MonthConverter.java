package pl.mazurmarcin.javastart.lecture5;

public class MonthConverter {

	public void convert(int monthNumber) {

		switch (monthNumber) {
		case 1:
			System.out.println("Stycze�");
			break;
		case 2:
			System.out.println("Luty");
			break;
		case 3:
			System.out.println("Marzec");
			break;
		case 4:
			System.out.println("Kwiecie�");
			break;
		case 5:
			System.out.println("Maj");
			break;
		case 6:
			System.out.println("Czerwiec");
			break;
		case 7:
			System.out.println("Lipiec");
			break;
		case 8:
			System.out.println("Sierpie�");
			break;
		case 9:
			System.out.println("Wrzesie�");
			break;
		case 10:
			System.out.println("Paxdziernik");
			break;
		case 11:
			System.out.println("Listopad");
			break;
		case 12:
			System.out.println("Grudzie�");
			break;
		default:
			System.out.println("Undefined");
		}

	}

}
