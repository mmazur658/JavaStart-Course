package pl.mazurmarcin.javastart.lecture9;

class Orchestra {

	public static void main(String[] args) {

		Instrument[] instruments = new Instrument[4];
		instruments[0] = new Guitar("Guitar1", "1999", 6);
		instruments[1] = new Trumpet("Trumpet1", "2007", "basowa");
		instruments[2] = new Guitar("Guitar2", "2009", 6);
		instruments[3] = new Trumpet("Trumpet2", "2018", "piccolo");

		for (Instrument instrument : instruments)
			instrument.play();

	}

}
