package pl.mazurmarcin.javastart.lecture11;

public class NamesHolderController {

	private NamesHolder namesHolder;

	public NamesHolderController(int numberOfNames) {
		namesHolder = new NamesHolder(numberOfNames);
	}

	public void add(String name) {

		try {
			namesHolder.add(name);
		} catch (NullPointerException exception) {
			System.out.println(exception.getMessage());
		} catch (ArrayIndexOutOfBoundsException exception) {
			System.out.println(exception.getMessage());
		} catch (DuplicateException exception) {
			System.out.println(exception.getMessage());
		}

	}

	public boolean contains(String name) {

		boolean isDuplicated = true;

		try {
			isDuplicated = namesHolder.contains(name);
		} catch (IllegalArgumentException exception) {
			System.out.println(exception.getMessage());
		}

		return isDuplicated;

	}

	public String size() {
		return namesHolder.size();
	}

	public void remove(String name) {

		try {
			namesHolder.remove(name);
		} catch (NullPointerException exception) {
			System.out.println(exception.getMessage());
		}

	}

}
