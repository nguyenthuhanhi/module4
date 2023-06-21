package com.example.validatesonginformation.service;

import com.example.validatesonginformation.entity.Song;

import java.util.List;

public interface ISongService {
    void create(Song song);

    void update(Song song);

    Song findById(int id);

    List<Song> findAll();

}
