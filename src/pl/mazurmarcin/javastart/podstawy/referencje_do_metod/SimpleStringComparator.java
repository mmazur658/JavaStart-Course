package pl.mazurmarcin.javastart.podstawy.referencje_do_metod;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SimpleStringComparator {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Marcin","Michał","Marzena","Michalina","Adam");
		
		Collections.sort(names, String::compareToIgnoreCase);
		
		System.out.println(names.toString());
		

	}

}
