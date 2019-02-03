package pl.mazurmarcin.javastart.zadania.tablice_i_sterowanie;

import java.util.Arrays;

public class Drink {

	private String drinkName;
	private Ingredient[] ingredients;

	public Drink(String drinkName, Ingredient[] ingredients) {
		this.drinkName = drinkName;
		this.ingredients = ingredients;
	}

	public String getDrinkName() {
		return drinkName;
	}

	public void setDrinkName(String drinkName) {
		this.drinkName = drinkName;
	}

	public Ingredient[] getIngredients() {
		return ingredients;
	}

	public void setIngredients(Ingredient[] ingredients) {
		this.ingredients = ingredients;
	}

	@Override
	public String toString() {
		return "Drink: " + drinkName + ", składniki: " + Arrays.toString(ingredients);
	}

}
