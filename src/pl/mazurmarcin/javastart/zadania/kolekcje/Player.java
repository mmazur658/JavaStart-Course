package pl.mazurmarcin.javastart.zadania.kolekcje;

public class Player implements Comparable<Player>{

	private String nickName;
	private int points;

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public Player(String nickName, int points) {
		this.nickName = nickName;
		this.points = points;
	}

	@Override
	public String toString() {
		return nickName + " - " + points;
	}

	@Override
	public int compareTo(Player object) {		
		return Integer.compare(object.points, this.points);
	}

}
