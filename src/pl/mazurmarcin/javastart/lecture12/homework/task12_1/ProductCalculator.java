package pl.mazurmarcin.javastart.lecture12.homework.task12_1;

public class ProductCalculator {

	public double getSumOfAllProducts(Product[] products) {

		double sum = 0;

		for (Product product : products)
			sum += product.getPrice();

		return sum;
	}

	public Product getTheMostExpensiveProduct(Product[] products) {

		Product product = products[0];

		for (Product tempProduct : products) {
			if (tempProduct.getPrice() > product.getPrice())
				product = tempProduct;
		}

		return product;
	}

	public String getNameOfMostPopularProducer(Product[] products) {

		String producer = products[0].getProducer();
		int count = numberOfProductsWithGivenProducer(products, producer);
		int tempCount = 0;

		for (Product product : products) {
			tempCount = numberOfProductsWithGivenProducer(products, producer);

			if (tempCount > count) {
				count = tempCount;
				producer = product.getName();

			}
		}

		return producer;
	}

	private int numberOfProductsWithGivenProducer(Product[] products, String producer) {

		int count = 0;

		for (Product product : products) {
			if (product.getProducer().equals(producer))
				count++;
		}

		return count;
	}

}
