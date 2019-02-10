package pl.mazurmarcin.javastart.lecture10;

public abstract class Vehicle implements Moveable {

	private String name;
	private int year;
	private Directions direction;

	public Vehicle(String name, int year) {
		this.name = name;
		this.year = year;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public Directions getDirection() {
		return direction;
	}

	@Override
	public String toString() {
		return "Nazwa: " + name + ", rok: " + year + ", kierunek: " + direction;
	}

	@Override
	public void turnLeft() {
		direction = Directions.LEFT;
	}

	@Override
	public void turnRight() {
		direction = Directions.RIGHT;
	}

	@Override
	public void goForward() {
		direction = Directions.FORWARD;
	}

	@Override
	public void goBack() {
		direction = Directions.BACK;
	}

	@Override
	public void stop() {
		direction = null;
	}

}
