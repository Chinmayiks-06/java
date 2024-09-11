package com.xworkz.songsapp.songs;

public class Songs {
    public String songName;
    public String artistName;
    public String albumName;
    public int duration;

    public void displayDetails() {
        System.out.println("Song Name: " + this.songName);
        System.out.println("Artist Name: " + this.artistName);
        System.out.println("Album Name: " + this.albumName);
        System.out.println("Duration: " + this.duration + " minutes");
    }
}
