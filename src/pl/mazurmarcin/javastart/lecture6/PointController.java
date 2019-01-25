package pl.mazurmarcin.javastart.lecture6;

public class PointController {

	public String quarter(Point point) {

		int x = point.getX();
		int y = point.getY();

		if (x >= 0 && y >= 0)
			return "I";
		else if (x < 0 && y >= 0)
			return "II";
		else if (x < 0 && y < 0)
			return "III";
		else
			return "IV";

	}

}
