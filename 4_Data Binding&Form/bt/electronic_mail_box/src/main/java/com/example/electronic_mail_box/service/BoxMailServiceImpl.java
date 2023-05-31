package com.example.electronic_mail_box.service;

import com.example.electronic_mail_box.model.BoxMail;
import com.example.electronic_mail_box.repository.IBoxMailRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BoxMailServiceImpl implements IBoxMailService {
    @Autowired
    IBoxMailRepository repository;
    @Override
    public List<BoxMail> findAll() {
        return repository.findAll();
    }

    @Override
    public BoxMail findById(int id) {
        return repository.findById(id);
    }

    @Override
    public void update(BoxMail boxMail) {
         repository.update(boxMail);
    }

    @Override
    public List<String> showListLanguages() {
        return repository.showListLanguages();
    }

    @Override
    public List<Integer> showListPageSize() {
        return repository.showListPageSize();
    }
}
