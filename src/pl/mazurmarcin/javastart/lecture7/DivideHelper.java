package pl.mazurmarcin.javastart.lecture7;

public class DivideHelper {

	public boolean isDividedByNumbers(int number) {

		for (int i = 11; i <= 20; i++) {
			if(number%11!=0) 
				return false;
			
		}
		
		return true;

	}

}
