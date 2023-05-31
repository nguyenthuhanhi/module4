package com.example.electronic_mail_box.service;

import com.example.electronic_mail_box.model.BoxMail;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IBoxMailService {
    List<BoxMail> findAll();
    BoxMail findById(int id);
    void update(BoxMail boxMail);
    List<String>showListLanguages();
    List<Integer>showListPageSize();


}
