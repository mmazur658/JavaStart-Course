package pl.mazurmarcin.javastart.lecture12;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableWriter {
	private final static String FILE_NAME = "product.product";

	private static void saveObjectToFile(Product product) throws IOException {

		FileOutputStream fileOutputStream = new FileOutputStream(FILE_NAME);
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

		objectOutputStream.writeObject(product);
		objectOutputStream.close();

	}

	private static Product readObjectFromFile() throws IOException, ClassNotFoundException {

		FileInputStream fileInputStream = new FileInputStream(FILE_NAME);
		ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

		Object readObject = objectInputStream.readObject();
		objectInputStream.close();

		return (Product) readObject;

	}

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Product product1 = new Product("Mleko", "Koło", 3.99);
		saveObjectToFile(product1);

		Product product2 = readObjectFromFile();

		System.out.println(product2);

	}

}
