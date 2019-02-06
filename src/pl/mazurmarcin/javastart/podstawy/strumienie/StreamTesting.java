package pl.mazurmarcin.javastart.podstawy.strumienie;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTesting {

	// https://javastart.pl/kurs/java-podstawy/java-podstawy-temat-40-strumienie/lekcja/java-podstawy-wprowadzenie-do-strumieni
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		// brak metody terminalnej czyli nie zostanie wykonane
		Stream<Integer> stream = numbers.stream().filter(x -> x % 2 == 0).filter(x -> x > 5);

		numbers = numbers.stream().filter(x -> x % 2 == 0).filter(x -> x > 5).collect(Collectors.toList());
		// .collect(Collectors.toCollection(ArrayList::new));

		numbers.stream().filter(x -> x % 2 == 0).filter(x -> x > 5).forEach(System.out::println);
		;

		Stream<String> strings = Stream.of("a", "bb", "ccc", "dddd", "eeeee", "ffffff", "ggggggg");
		strings.map(String::toUpperCase).peek(System.out::println).collect(Collectors.toList());
	}

}
