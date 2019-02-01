package pl.mazurmarcin.javastart.podstawy.typy_generyczne;

public class PairTest {

	public static void main(String[] args) {

		Pair<String, Double> pair1 = new Pair("Andrzej", 3000);
		Pair<Integer, Integer> pair2 = new Pair(2007, 2009);
		Pair<Integer, String> pair3= new Pair(20, "Niedziela");
		
		System.out.println(pair1);
		System.out.println(pair2);
		System.out.println(pair3);
		

	}

}
