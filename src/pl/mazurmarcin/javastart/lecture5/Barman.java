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
			System.out.println(person.getFirstName() + ", Tw�j drink jest gotowy do odbioru. Kwota do zap�aty "
					+ drink.getPrice() + ". ");
		else
			System.out.println("Osoby niepe�noletnie nie mog� kupi� alkoholu");

	}

}
