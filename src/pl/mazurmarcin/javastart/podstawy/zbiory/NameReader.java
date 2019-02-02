package pl.mazurmarcin.javastart.podstawy.zbiory;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.TreeSet;

public class NameReader {

	public static void main(String[] args) throws IOException {

		String fileName = "namespl2.txt";

		TreeSet<String> namesSet = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String object1, String object2) {
				return -(object1.compareTo(object2));
			}

		});

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {

			String line;

			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
				namesSet.add(line);
			}		

		} catch (FileNotFoundException exception) {
			System.err.println("The file has not been found.");
			exception.printStackTrace();
		} catch (IOException exception) {
			System.err.println("Error during reading data");
			exception.printStackTrace();
		}

		System.out.println("Razem imion: " + namesSet.size());
		System.out.println("Pierwsze: " + namesSet.first());
		System.out.println("Ostatnie: " + namesSet.last());

	}

}
