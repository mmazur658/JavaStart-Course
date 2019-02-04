package pl.mazurmarcin.javastart.podstawy.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LottoGames {

	public static void main(String[] args) {

		Lotto lotto = new Lotto();
		Scanner scanner = new Scanner(System.in);
		List<Integer> userNumbers = new ArrayList<>();

		System.out.println("Podaj " + lotto.getMaxNumbers() + " liczb: ");
		for (int i = 0; i < lotto.getMaxNumbers(); i++)
			userNumbers.add(scanner.nextInt());
		
		scanner.close();

		int result = lotto.checkResult(userNumbers);
		System.out.println("Trafiłeś: " + result);

	}

}
