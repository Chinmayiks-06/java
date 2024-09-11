package com.xworkz.songsapp;

import com.xworkz.songsapp.songs.Songs;
import com.xworkz.songsapp.spotify.Spotify;

public class SongRunner {
        public static void main(String[] args) {

            Songs song = new Songs();
            song.songName = "Blinding Lights";
            song.artistName = "The Weeknd";
            song.albumName = "After Hours";
            song.duration = 2;

            Spotify player = new Spotify();
            player.playSong(song);
        }
}
