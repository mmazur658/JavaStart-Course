package pl.mazurmarcin.javastart.lecture14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class WordsListApp {

	private final String[] WORDS = { "zzz", "ccc", "yyy", "yyy", "nnn", "mmm", "eee", "aaa", "aaa", "bbb", "uuu", "aaa",
			"ddd", "zzz", "mmm", "ccc" };

	private List<String> list = new ArrayList<>();

	public WordsListApp() {
		fillListWithWords();
	}

	public void fillListWithWords() {
		for (int i = 0; i < WORDS.length; i++)
			list.add(WORDS[i]);

	}

	public void printList() {
		System.out.println(list);
	}

	public void sortListWithNaturalOrder() {
		Collections.sort(list);
	}

	public void sortListWithReversedOrder() {
		Collections.reverse(list);
	}

	private Map<String, Integer> getMapWithStatistics() {

		Map<String, Integer> map = new TreeMap<>();

		for (String word : list) {

			if (map.containsKey(word))
				map.put(word, map.get(word) + 1);
			else
				map.put(word, 1);
		}

		return map;
	}

	public void printStatistics() {

		Map<String, Integer> map = getMapWithStatistics();

		Set<Entry<String, Integer>> entries = map.entrySet();

		for (Entry<String, Integer> entry : entries)
			System.out.println(entry.getKey() + ": " + entry.getValue());

	}

	public void printMostPopularWord() {

		Map<String, Integer> map = getMapWithStatistics();

		int number = Integer.MIN_VALUE;
		String key = "";

		for (Entry<String, Integer> entry : map.entrySet()) {
			if (entry.getValue() > number) {
				number = entry.getValue();
				key = entry.getKey();
			}
		}

		System.out.println("Najwięcej wystąpień ma " + key + ": " + number);

	}

}
