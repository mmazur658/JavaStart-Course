package pl.mazurmarcin.javastart.zadania.kolekcje;

import java.util.List;

public class PaymentService {

	private static final double SAMLL_TIP = 0.1;
	private static final double BIG_TIP = 0.15;
	private static final double MARGIN = 100;

	public static double getServiceCost(double price) {
		return (price < MARGIN) ? price*BIG_TIP : price*SAMLL_TIP;
	}
		
	public static double getOrderSum(List<Dish> dishesList) {
		
		/*int sum=0;
		
		for (Dish dish : dishesList) 
			sum += dish.getPrice();
		
		return sum;*/
		
		return dishesList.stream().mapToDouble(Dish::getPrice).sum();
		
	}
}
