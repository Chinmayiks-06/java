package com.spotify.musics;

import com.spotify.musics.dao.SpotifyDao;
import com.spotify.musics.dto.SpotifyDto;

public class SpotifyRunner {

    public  static  void main(String reg[]){
        System.out.println("main started");

        SpotifyDao spotifyDao=new SpotifyDao();
        SpotifyDto spotifyDto=new SpotifyDto();
        spotifyDto.userName="Chins";
        spotifyDto.userId=12;
        spotifyDto.email="abc@gmail.com";
        spotifyDto.gender="Female";

        boolean ref=spotifyDao.createAccount(spotifyDto);
        System.out.println("account created"+ref);
        spotifyDao.getDetail();
        System.out.println("main ended");

    }
}