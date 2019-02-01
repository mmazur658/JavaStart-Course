package pl.mazurmarcin.javastart.podstawy.typy_opakowujace;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

public class NumbersReader {

	public static void main(String[] args) throws IOException {

		String fileName = "numbers.txt";
		int a = 0;
		int b = 0;
		int c = 0;
		BigInteger aBig = null;
		BigInteger bBig = null;

		try (FileReader fileReader = new FileReader(fileName);
				BufferedReader bufferedReader = new BufferedReader(fileReader);) {

			a = Integer.valueOf(bufferedReader.readLine());
			b = Integer.valueOf(bufferedReader.readLine());
			c = Integer.valueOf(bufferedReader.readLine());

			aBig = new BigInteger(bufferedReader.readLine());
			bBig = new BigInteger(bufferedReader.readLine());

			System.out.println(a + " + " + b + " + " + c + " = " + (a + b + c));
			System.out.println(aBig + " * " + bBig + " = " + aBig.multiply(bBig));

		} catch (FileNotFoundException exception) {
			System.err.println("Plik nie zosta³ odnaleziony");
			exception.printStackTrace();
		} catch (IOException exception) {
			System.err.println("B³¹d odczytu danych");
			exception.printStackTrace();
		}

	}

}
