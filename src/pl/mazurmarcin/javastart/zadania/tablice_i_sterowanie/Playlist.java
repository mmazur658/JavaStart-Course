package pl.mazurmarcin.javastart.zadania.tablice_i_sterowanie;

public class Playlist {

	public static int getPlaylistLength(Song... songs) {

		int totalTime = 0;

		for (Song song : songs)
			totalTime += song.getLength();

		return totalTime;

	}

	public static String getFormattedTime(int seconds) {

		int hour = seconds / (60 * 60);
		seconds %= (60 * 60);
		int minutes = seconds / 60;		
		seconds = seconds % 60;

		return hour+":"+minutes+":"+seconds;

	}

}
