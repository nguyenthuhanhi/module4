package com.example.validatesonginformation.service;

import com.example.validatesonginformation.entity.Song;
import com.example.validatesonginformation.repository.ISongRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional

public class SongServiceImpl implements ISongService{
    @Autowired
    private ISongRepository repository;

    @Override
    public void create(Song song) {

    }

    @Override
    public void update(Song song) {

    }

    @Override
    public Song findById(int id) {
        return null;
    }

    @Override
    public List<Song> findAll() {
        return (List<Song>)repository.findAll();
    }
}
