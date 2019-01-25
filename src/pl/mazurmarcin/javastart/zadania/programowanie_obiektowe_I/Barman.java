package pl.mazurmarcin.javastart.zadania.programowanie_obiektowe_I;

public class Barman {

	public Drink createDrink(String name, Ingredient ingredient1, Ingredient ingredient2, Ingredient ingredient3) {

		Drink drink = new Drink(name, ingredient1, ingredient2, ingredient3);

		return drink;

	}

	public void printDrink(Drink drink) {

		double totalCapacity = drink.getIngredient1().getCapacity() + drink.getIngredient2().getCapacity()
				+ drink.getIngredient3().getCapacity();
		
		System.out.println("Nazwa drinka: "+drink.getName()+", sk³adniki: ");
		System.out.println(drink.getIngredient1().toString());
		System.out.println(drink.getIngredient2().toString());
		System.out.println(drink.getIngredient3().toString());
		System.out.println("Pojemnoœæ ca³kowita: "+totalCapacity);
	}

}
