package OOPS.Questions.question15;

import java.util.ArrayList;
import java.util.Random;

//Write a Java program to create a class called "MusicLibrary" with a collection of
//songs and methods to add and remove songs, and to play a random song.
public class MusicLibrary {
    private ArrayList<Song> songs ;
    public MusicLibrary(){
        this.songs = new ArrayList<>();
    }
    public void addSong(Song song){
        songs.add(song);
    }
    public void removeSong(Song song){
        songs.remove(song);
    }
    public ArrayList<Song> getSongs(){
        return  songs;
    }
    public void playRandomSong(){
        int size = songs.size();
        if(size==0){
            System.out.println("No songs in the libray.");
            return;
        }
        Random random = new Random();
        int index= random.nextInt(size);
        System.out.println("Now playing: " + songs.get(index).getSongName() +" by " + songs.get(index).getArtist());

    }


}
