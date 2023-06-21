package com.example.photo_of_the_day.service;

import com.example.photo_of_the_day.entity.Picture;
import com.example.photo_of_the_day.repository.IPictureReposirory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PictureServiceImpl implements IPictureService{
    @Autowired
    IPictureReposirory reposirory;


    @Override
    public List<Picture> findAll() {
        return reposirory.findAll();
    }

    @Override
    public List<Picture> findAllToday(String date) {
        return reposirory.findAllToday(date);
    }

    @Override
    public Picture findById(int id) {
        return reposirory.findById(id);
    }

    @Override
    public boolean addPicture(Picture picture) {
         reposirory.addPicture( picture);
         return  true;
    }

    @Override
    public boolean addLike(Picture picture) {
        reposirory.addLike( picture);
        return true;
    }
}
