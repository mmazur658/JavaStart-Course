package pl.mazurmarcin.javastart.lecture9;

public class Customer extends PersonalData {

	private double accountBalance;

	public Customer(String firstName, String lastName, String address, String phoneNumbr, double accountBalance) {
		super(firstName, lastName, address, phoneNumbr);
		this.accountBalance = accountBalance;
	}

	public Customer() {

	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	@Override
	public String toString() {
		return super.toString() + ", saldo: " + accountBalance;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.print(", saldo: " + accountBalance);
	}


}
