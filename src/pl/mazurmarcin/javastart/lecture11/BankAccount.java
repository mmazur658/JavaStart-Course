package pl.mazurmarcin.javastart.lecture11;

public class BankAccount {

	private double limit = 0;
	private Person person;
	private double balance;

	public BankAccount(Person person, double balance) {

		if (person == null)
			throw new NullPointerException("Nie można utworzyć konta bez osoby.");
		this.person = person;
		this.balance = balance;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}

	@Override
	public String toString() {
		return "BankAccount właściciel: " + person + ", kwota:" + balance;
	}

	public void deposit(double value) {
		balance += value;
	}

	public void withdraw(double value) {

		if (value > balance)
			throw new NotEnoughBalanceException("Niewystarczające środki na koncie");

		if (value > limit)
			throw new WithdrawValueOutOfLimitBoundsException(
					"Nie można wypłacić więcej niż limit: " + limit + ", żądanie: " + value);

		balance -= value;
	}

}
