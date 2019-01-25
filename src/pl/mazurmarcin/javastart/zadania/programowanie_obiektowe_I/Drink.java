package pl.mazurmarcin.javastart.zadania.programowanie_obiektowe_I;

public class Drink {

	private String name;
	private Ingredient ingredient1;
	private Ingredient ingredient2;
	private Ingredient ingredient3;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Ingredient getIngredient1() {
		return ingredient1;
	}

	public void setIngredient1(Ingredient ingredient1) {
		this.ingredient1 = ingredient1;
	}

	public Ingredient getIngredient2() {
		return ingredient2;
	}

	public void setIngredient2(Ingredient ingredient2) {
		this.ingredient2 = ingredient2;
	}

	public Ingredient getIngredient3() {
		return ingredient3;
	}

	public void setIngredient3(Ingredient ingredient3) {
		this.ingredient3 = ingredient3;
	}

	public Drink(String name, Ingredient ingredient1, Ingredient ingredient2, Ingredient ingredient3) {
		this.name = name;
		this.ingredient1 = ingredient1;
		this.ingredient2 = ingredient2;
		this.ingredient3 = ingredient3;
	}

	public Drink() {

	}

	@Override
	public String toString() {
		return "Drink [name=" + name + ", ingredient1=" + ingredient1 + ", ingredient2=" + ingredient2
				+ ", ingredient3=" + ingredient3 + "]";
	}
	
	

}
