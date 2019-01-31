package pl.mazurmarcin.javastart.lecture7.homebudget;

public class HomeBudgetApp {

	public static void main(String[] args) {

		HomeBudgetController homeBudgetController = new HomeBudgetController();
		HomeBudgetMenu menu = new HomeBudgetMenu();

		int userInput = 0;

		do {

			menu.showMainMenu();
			userInput = homeBudgetController.getSelectedOption();

			switch (userInput) {
			
			case 1:
				homeBudgetController.addNewOutgo();				
				break;
			case 2:
				homeBudgetController.printAllOutgoes();
				break;
			case 3: 
				homeBudgetController.showOutgoesBiggerThenGivenValue();
				break;
			case 4:
				homeBudgetController.showOutgoesForGivenType();
				break;
			case 5: 
				homeBudgetController.showMonthlyOutgoes();
				break;
			case 6:
				homeBudgetController.showYearlyChart();
				break;
			case 7:
				System.out.println("Do zobaczenia!");
				break;
			default:
				System.out.println("Opcja nieznana, wybierz ponownie");	
			}

		} while (!(userInput == 7));
		
		homeBudgetController.closeScanner();

	}

}
