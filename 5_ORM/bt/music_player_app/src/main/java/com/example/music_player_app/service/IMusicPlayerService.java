package com.example.music_player_app.service;

import com.example.music_player_app.entity.MusicPlayer;

import java.util.List;

public interface IMusicPlayerService {

     List<MusicPlayer> findAll();
     void create (MusicPlayer musicPlayer);
     void update (MusicPlayer musicPlayer);
     MusicPlayer findById(int id);
     void delete(int id );
}
