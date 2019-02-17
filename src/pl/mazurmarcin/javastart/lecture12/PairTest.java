package pl.mazurmarcin.javastart.lecture12;

public class PairTest {

	public static void main(String[] args) {

		Pair<Double, Integer> pair1 = new Pair<>(8.8, 6);
		Pair<Integer, Double> pair2 = new Pair<>(5, 6.0);
		
		double a = pair1.getA();
		double b = pair2.getA();
		
		System.out.println(a+b);

	}

}
