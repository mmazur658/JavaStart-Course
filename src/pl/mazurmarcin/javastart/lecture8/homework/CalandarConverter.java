package pl.mazurmarcin.javastart.lecture8.homework;

public class CalandarConverter {

	private static final int MONDAY = 1;
	private static final int TUESDAY = 2;
	private static final int WEDNESDAY = 3;
	private static final int THURSDAY = 4;
	private static final int FRIDAY = 5;
	private static final int SATURDAY = 6;
	private static final int SUNDAY = 7;

	public static String convertDayToString(int dayNumber) {

		switch (dayNumber) {
		case MONDAY:
			return "Poniedzia³ek";
		case TUESDAY:
			return "Wtorek";
		case WEDNESDAY:
			return "Œroda";
		case THURSDAY:
			return "Czwartek";
		case FRIDAY:
			return "Pi¹tek";
		case SATURDAY:
			return "Sobota";
		case SUNDAY:
			return "Niedziela";
		default:
			return "Niepoprawny number dnia";
		}

	}
}
