package pl.mazurmarcin.javastart.lecture14.homework.task14_2;

public class Result implements Comparable<Result> {

	private String name;
	private int score;

	public Result(String name, int score) {
		this.name = name;
		this.score = score;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return name + " " + score;
	}

	public String toCsv() {
		return name + ";" + score;
	}

	@Override
	public int compareTo(Result o) {

		if (this.score < o.score)
			return 1;
		else if (this.score == o.score)
			return 0;
		else
			return -1;
	}

}
