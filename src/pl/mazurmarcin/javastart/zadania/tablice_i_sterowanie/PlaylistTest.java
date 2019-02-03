package pl.mazurmarcin.javastart.zadania.tablice_i_sterowanie;

public class PlaylistTest {

	public static void main(String[] args) {

		Song song1 = new Song("aaa", 600);
		Song song2 = new Song("bbb", 360);
		Song song3 = new Song("ccc", 290);
		Song song4 = new Song("ddd", 520);
		Song song5 = new Song("eee", 333);
		Song song6 = new Song("fff", 193);		
		Song song99 = new Song("zzz", 19932);

		int totalTime = Playlist.getPlaylistLength(song1, song2, song3, song4, song5, song6, song99);
		
		System.out.println("Czas całkowity w sekundach: "+totalTime);
		
		System.out.println("Czas po formatowaniu: "+Playlist.getFormattedTime(totalTime));

	}

}
