package OOPS.Questions.question15;

public class Song {
    private String songName,artist;

    public Song(String songName, String artist) {
        this.songName = songName;
        this.artist = artist;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
    public void printSongDetails(){
        System.out.println(songName +" is sung by "+artist);
    }
}
