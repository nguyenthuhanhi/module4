package com.example.music_player_app.service;

import com.example.music_player_app.entity.MusicPlayer;
import com.example.music_player_app.repository.IMusicPlayerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MusicPlayerServiceImpl implements IMusicPlayerService{
    @Autowired
    private IMusicPlayerRepo repo;

    @Override
    public List<MusicPlayer> findAll() {
        return repo.findAll();
    }

    @Override
    public void create(MusicPlayer musicPlayer) {
        repo.create(musicPlayer);
    }

    @Override
    public void update(MusicPlayer musicPlayer) {
        repo.update(musicPlayer);
    }

    @Override
    public MusicPlayer findById(int id) {
        return repo.findById(id);
    }

    @Override
    public void delete(int id ) {
        repo.delete(id);
    }
}
