package pl.mazurmarcin.javastart.lecture10;

public enum Directions {

	LEFT("lewo"), RIGHT("prawo"), FORWARD("prosto"), BACK("wstecz");

	private String direction;

	Directions(String direction) {
		this.direction = direction;

	}

	public String getDirection() {
		return direction;
	}

}
