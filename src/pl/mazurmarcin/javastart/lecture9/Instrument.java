package pl.mazurmarcin.javastart.lecture9;

public class Instrument {

	private String producer;
	private String year;

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public Instrument(String producer, String year) {
		this.producer = producer;
		this.year = year;
	}
	
	public Instrument() {
		
	}
	
	public void play() {
		
	}
	

}
