package pl.mazurmarcin.javastart.zadania.tablice_i_sterowanie;

public class Song {

	private String name;
	private int length;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Song(String name, int length) {
		this.name = name;
		this.length = length;
	}

	@Override
	public String toString() {
		return "Song [name=" + name + ", length=" + length + "]";
	}

}
