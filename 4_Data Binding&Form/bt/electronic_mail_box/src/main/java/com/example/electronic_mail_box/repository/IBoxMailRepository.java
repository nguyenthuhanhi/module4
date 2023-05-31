package com.example.electronic_mail_box.repository;

import com.example.electronic_mail_box.model.BoxMail;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBoxMailRepository {
    List<BoxMail> findAll();

    BoxMail findById(int id);

    void update(BoxMail boxMail);

    List<String> showListLanguages();

    List<Integer> showListPageSize();
}
