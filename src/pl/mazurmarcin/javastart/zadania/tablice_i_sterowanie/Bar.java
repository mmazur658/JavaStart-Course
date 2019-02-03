package pl.mazurmarcin.javastart.zadania.tablice_i_sterowanie;

public class Bar {
	
	public static void main(String[] args) {
		
		Barman barman = new Barman();
		
		Drink drink = barman.createDrink();
		
		barman.printDrink(drink);
		
	}

}
