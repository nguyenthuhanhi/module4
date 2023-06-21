package com.example.photo_of_the_day.service;

import com.example.photo_of_the_day.entity.Picture;

import java.util.List;

public interface IPictureService {
    List <Picture> findAll();
    List <Picture> findAllToday(String date);
    Picture findById(int id);
    boolean addPicture(Picture picture);
    boolean addLike (Picture picture);
}
