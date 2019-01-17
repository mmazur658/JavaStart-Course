package pl.mazurmarcin.javastart.lecture2;

public class Pub {

    public static void main(String[] args) {

        Drink drinkOne = new Drink();

        drinkOne.name = "Mad dog";
        drinkOne.price = 15.00;
        drinkOne.isAlcoholic = true;

        drinkOne.ingredient1 = new Ingredient("Vodka", 40);
        drinkOne.ingredient2 = new Ingredient("Tabasco sauce", 3);
        drinkOne.ingredient3 = new Ingredient("Raspberry syrup", 7);

        String isAlcoholicString = drinkOne.isAlcoholic ? "YES" : "NO";

        System.out.println("Drink name: " + drinkOne.name);
        System.out.println("Drink price: " + drinkOne.price);
        System.out.println("Contains alcohol: " + isAlcoholicString);
        System.out.println("First ingredient: " + drinkOne.ingredient1.name + " " + drinkOne.ingredient1.quantity);
        System.out.println("Second ingredient: " + drinkOne.ingredient2.name + " " + drinkOne.ingredient2.quantity);
        System.out.println("Third ingredient: " + drinkOne.ingredient3.name + " " + drinkOne.ingredient3.quantity);

        System.out.println("Total quantity: "+(drinkOne.ingredient1.quantity+drinkOne.ingredient2.quantity+drinkOne.ingredient3.quantity)+" ml");


    }
}
