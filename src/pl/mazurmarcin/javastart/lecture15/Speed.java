package pl.mazurmarcin.javastart.lecture15;

public enum Speed {

	SLOW(30), NORMAL(90), FAST(120);

	private final int speedValue;

	private Speed(int speedValue) {
		this.speedValue = speedValue;
	}

	public int getSpeedValue() {
		return speedValue;
	}

	public static Speed getByValue(int speedValue) {

		for (Speed speed : Speed.values()) {

			if (speed.getSpeedValue() == speedValue)
				return speed;

		}

		return null;
	}

}
