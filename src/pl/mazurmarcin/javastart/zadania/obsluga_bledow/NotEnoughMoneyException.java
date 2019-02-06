package pl.mazurmarcin.javastart.zadania.obsluga_bledow;

public class NotEnoughMoneyException extends RuntimeException {

	public NotEnoughMoneyException(double gamePrice, double money) {

		super(String.format("The game cost: %.2f, you have paid only %.2f.", gamePrice, money));

	}

}
