package pl.mazurmarcin.javastart.lecture9;

public class Guitar extends Instrument {

	private int nubmerOfStrings;

	public int getNubmerOfStrings() {
		return nubmerOfStrings;
	}

	public void setNubmerOfStrings(int nubmerOfStrings) {
		this.nubmerOfStrings = nubmerOfStrings;
	}

	public Guitar(String producer, String year, int nubmerOfStrings) {
		super(producer, year);
		this.nubmerOfStrings = nubmerOfStrings;
	}

	@Override
	public void play() {
		System.out.println("brzdęk brzdęk");
	}

}
