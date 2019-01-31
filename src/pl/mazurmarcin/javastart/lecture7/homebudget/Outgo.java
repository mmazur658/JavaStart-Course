package pl.mazurmarcin.javastart.lecture7.homebudget;

public class Outgo {

	private int monthNumer;
	private double amount;
	private String type;

	public int getMonthNumer() {
		return monthNumer;
	}

	public void setMonthNumer(int monthNumer) {
		this.monthNumer = monthNumer;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Miesi¹æ: " + monthNumer + ", Typ: " + type + ", Wartoœæ: " + amount;
	}

	public Outgo(int monthNumer, double amount, String type) {
		this.monthNumer = monthNumer;
		this.amount = amount;
		this.type = type;
	}

	public Outgo() {

	}

}
