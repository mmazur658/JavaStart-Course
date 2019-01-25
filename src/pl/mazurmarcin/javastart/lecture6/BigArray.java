package pl.mazurmarcin.javastart.lecture6;

public class BigArray {

	public static void main(String[] args) {

		int[][] bigArr = new int[4][];
		bigArr[0] = new int[] { 1, 2, 3 };
		bigArr[1] = new int[] { 4, 5 };
		bigArr[2] = new int[] { 6, 7, 8, 9 };
		bigArr[3] = new int[] { 10 };

		int sum = 0;
		for (int i = 0; i < bigArr.length; i++)
			sum += bigArr[i][0];

		System.out.println("Suma pierwszej kolumny: " + sum);

		int[][] arr = { { 1, 2, 3 }, { 4, 5 }, { 6, 7, 8, 9 }, { 10 } };
	}

}
