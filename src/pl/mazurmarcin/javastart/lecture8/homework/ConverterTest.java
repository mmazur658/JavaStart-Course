package pl.mazurmarcin.javastart.lecture8.homework;

public class ConverterTest {

	public static void main(String[] args) {

		for (int i = 1; i <= 7; i++)
			System.out.println(i + " dzie� tygodnia to " + CalandarConverter.convertDayToString(i));

	}

}
