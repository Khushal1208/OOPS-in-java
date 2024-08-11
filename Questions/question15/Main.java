package OOPS.Questions.question15;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        MusicLibrary album = new MusicLibrary();
//        Song song1 = new Song("kajra re","A.R Rehman"); // here there is no need to create object of each song
//        because song will play in ramdom way and object does'nt matters
//        album.addSong(song1);

        album.addSong(new Song("Imagine", "John Lennon"));
        album.addSong(new Song("kajra re","A.R Rehman"));
        album.addSong(new Song("Midnight Train to Georgia", "Gladys Knight & the Pips"));
        album.addSong(new Song("Stairway to Heaven", "Led Zeppelin"));
        album.addSong(new Song("Imagine", "John Lennon"));
        album.addSong(new Song("All by Myself", "Eric Carmen"));
        album.addSong(new Song("What'd I Say", "Ray Charles"));
        album.addSong(new Song("Walking in Memphis", "Marc Cohn"));
        album.addSong(new Song("In the Air Tonight", "Phil Collins"));


        for(Song song:album.getSongs()){
            song.printSongDetails();
        }
        System.out.println("\n**Playing Random Song**");
        album.playRandomSong();
        System.out.println();
        album.playRandomSong();
        System.out.println();
        album.playRandomSong();

    }
}
