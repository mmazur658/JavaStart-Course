package pl.mazurmarcin.javastart.lecture12;

import java.util.ArrayList;

public class Wrappers {

	public static void main(String[] args) {

		int x = 120;
		Integer x1 = Integer.valueOf(x);
		Integer x2 = 120;		
		
		System.out.println((x1==x2)+" "+(x1.equals(x2)));
		
		x1 = new Integer(250);
		x2 = 250;
		
		System.out.println((x1==x2)+" "+(x1.equals(x2)));
		
		ArrayList<String> list = new ArrayList<>();
		

	}

}
