package pl.mazurmarcin.javastart.lecture11;

import java.util.Arrays;

public class NamesHolder {

	private String[] names;
	private int index = 0;

	public NamesHolder(int arrayLength) {
		names = new String[arrayLength];
	}

	public void add(String name) {

		if (name == null)
			throw new NullPointerException("Field name cannot be null");

		if (index == names.length)
			throw new ArrayIndexOutOfBoundsException("There's no space for more names");

		if (contains(name))
			throw new DuplicateException("The given name is allready in the array");

		names[index] = name;
		index++;
	}

	public boolean contains(String name) {

		if (name == null)
			throw new IllegalArgumentException("Incorrect data  - The given name cannot be null");

		for (int i = 0; i < index; i++) {
			if (name.equals(names[i]))
				return true;
		}

		return false;
	}

	public String size() {
		return index + " / " + names.length+"  "+Arrays.toString(names);
	}

	public void remove(String name) {

		if (name == null)
			throw new NullPointerException("The given name cannot be null");

		int i = Arrays.asList(names).indexOf(name);

		if (i > -1) {
			for (; i < names.length - 1; i++) {
				names[i] = names[i + 1];
			}
			names[names.length - 1] = null;
			index--;
		}

	}

}
