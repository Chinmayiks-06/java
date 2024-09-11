package com.xworkz.songsapp.spotify;

import com.xworkz.songsapp.songs.Songs;

public class Spotify{

    public  Songs song;

    public void playSong(Songs song) {
        if (song != null) {
            System.out.println("Playing song...");
            this.song=song;
            this.song.displayDetails();
        } else {
            System.out.println("No song selected to play.");
        }
    }
}

