package pl.mazurmarcin.javastart.lecture9;

public class Trumpet extends Instrument {

	private String type;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Trumpet(String producer, String year, String type) {
		super(producer, year);
		this.type = type;
	}

	@Override
	public void play() {
		System.out.println("tuturutu");
	}
	
}
