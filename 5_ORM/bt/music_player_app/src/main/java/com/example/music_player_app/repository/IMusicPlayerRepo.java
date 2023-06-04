package com.example.music_player_app.repository;

import com.example.music_player_app.entity.MusicPlayer;

import java.util.List;

public interface IMusicPlayerRepo {
    List<MusicPlayer> findAll();

    void create(MusicPlayer music);

    void update(MusicPlayer musicPlayer);

    MusicPlayer findById(int id);

    void delete(int id );
}
