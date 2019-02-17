package pl.mazurmarcin.javastart.lecture12.homework.task12_1;

public class ProductCreator {

	public static void main(String[] args) {

		Product[] products = { new Product("Mleko", "Koło", 2.8), new Product("Czekolada", "Wedel", 2.99),
				new Product("Jogurt", "Koło", 0.99), new Product("Śmietana", "Koło", 1.99),
				new Product("Baton", "Wedel", 1.45),
				new Product("Szynka", "Zakłady Mięsne Nieprawdopodobieńscy", 13.25),
				new Product("Schab", "Zakłady Mięsne Nieprawdopodobieńscy", 15.99),
				new Product("Golonka", "Ubojnia Gostyń", 9.99), new Product("Długopis", "Bic", 0.45),
				new Product("Zeszyt", "Bic", 2.05)

		};

		ProductFileManager productFileManager = new ProductFileManager();
		productFileManager.exportProductsToCsv(products);

	}

}
