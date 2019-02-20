package pl.mazurmarcin.javastart.lecture13;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IteratorTest {

	public static void main(String[] args) {

		String[] names = { "Marcin", "Anna", "Zbigniew", "Andrzej", "Karol" };
		Set<String> set = new HashSet<>(Arrays.asList(names));

		for (String string : set)
			System.out.println(string);

	}

}
