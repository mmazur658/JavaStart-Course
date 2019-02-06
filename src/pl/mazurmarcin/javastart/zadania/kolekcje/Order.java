package pl.mazurmarcin.javastart.zadania.kolekcje;

import java.util.List;

public class Order {

	private List<Dish> dishesList;

	public Order(List<Dish> dishesList) {
		this.dishesList = dishesList;
	}

	@Override
	public String toString() {

		double dishesCost = PaymentService.getOrderSum(dishesList);
		double serviceCost = PaymentService.getServiceCost(dishesCost);
		double totalCost = dishesCost + serviceCost;

		return String.format("Do zapłaty: %.2f PLN w tym: \nKoszt dań: %.2f \nKoszt obsługi: %.2f ", totalCost,
				dishesCost, serviceCost);
	}
}
