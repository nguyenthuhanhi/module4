package com.example.update_photo1.service;

import com.example.update_photo1.entity.Picture;

import java.util.List;

public interface IPictureService {
    List <Picture> findAll();
    List <Picture> findAllToday(String date);
    Picture findById(int id);
    boolean addPicture(Picture picture);
    boolean addLike (Picture picture);

    void create(Picture picture);
}
