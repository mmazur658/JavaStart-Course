package pl.mazurmarcin.javastart.lecture5;

public class Barman {
	

	public boolean isAbleToBuyDrink(Person person, Drink drink) {
		
		return !(!person.isAdult() && drink.isAlcoholic());		

	}

	public static void main(String[] args) {

		Person person = new Person("Marcin", "Mazur", 19);
		Drink drink = new Drink("Whisky", 15.5, true);
		Barman barman = new Barman();

		if (barman.isAbleToBuyDrink(person, drink))
			System.out.println(person.getFirstName() + ", Twój drink jest gotowy do odbioru. Kwota do zap³aty "
					+ drink.getPrice() + ". ");
		else
			System.out.println("Osoby niepe³noletnie nie mog¹ kupiæ alkoholu");

	}

}
