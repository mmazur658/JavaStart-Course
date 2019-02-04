package pl.mazurmarcin.javastart.podstawy.iteratory;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class NamesIterator {

	public static void main(String[] args) {

		Map<String, String> names = new TreeMap<>();
		
		names.put("Mazur", "Marcin Mazur 30");
		names.put("Zawada", "Karol Zawada 45");
		names.put("Kowalski","Michał Kowalski 20");
		names.put("Annon","Antoni Annon 69");
		names.put("Kabański","Andrzej Kabański 50");
		
		Iterator<String> iterator = names.values().iterator();
		
		while(iterator.hasNext()) 
			System.out.println(iterator.next());
		
	}

}
