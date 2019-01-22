package pl.mazurmarcin.javastart.lecture5;

public class YearCheck {

	public boolean isLeap(int year) {

		return (year % 400 == 0 || (year % 4 == 0 && (year % 100 > 0)));

	}

	public static void main(String[] args) {

		int year = 2000;

		YearCheck yearCheck = new YearCheck();

		System.out.println(yearCheck.isLeap(year));

	}

}
