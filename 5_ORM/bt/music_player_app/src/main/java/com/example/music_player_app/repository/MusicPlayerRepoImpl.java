package com.example.music_player_app.repository;

import com.example.music_player_app.entity.MusicPlayer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class MusicPlayerRepoImpl implements  IMusicPlayerRepo{

@PersistenceContext
private EntityManager entityManager;



    @Override
    public List<MusicPlayer> findAll() {
        return entityManager.createQuery("select m from MusicPlayer m").getResultList();
    }

    @Override
    public void create(MusicPlayer music) {
        entityManager.persist(music);
    }

    @Override
    public void update(MusicPlayer musicPlayer) {
        entityManager.merge(musicPlayer);
    }

    @Override
    public MusicPlayer findById(int id) {
        return entityManager.find(MusicPlayer.class,id);
    }

    @Override
    public void delete(int id ) {
            entityManager.remove(findById(id));
    }
}
