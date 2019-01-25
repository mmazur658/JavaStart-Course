package pl.mazurmarcin.javastart.zadania.programowanie_obiektowe_I;

public class Bar {

	public static void main(String[] args) {

		Barman barman = new Barman();

		Drink drink = barman.createDrink("Wodka with coke", new Ingredient("Wodka", 200), new Ingredient("Code", 100),
				new Ingredient("Ice", 50));
		
		barman.printDrink(drink);

	}

}
