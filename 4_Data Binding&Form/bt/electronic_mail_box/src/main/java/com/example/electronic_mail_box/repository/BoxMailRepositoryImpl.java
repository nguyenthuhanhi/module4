package com.example.electronic_mail_box.repository;

import com.example.electronic_mail_box.model.BoxMail;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BoxMailRepositoryImpl implements IBoxMailRepository{

    private static List<BoxMail> list;
    private static List<String> listLanguages;
    private static List<Integer> listSize;
    static {
        list = new ArrayList<>();
        list.add(new BoxMail(1,"English",5,true,"King,Asgard"));
        list.add(new BoxMail(2,"Vietnamese",15,false,"Hiep Duc,Quang Nam"));
        list.add(new BoxMail(3,"Japanese",25,true," Kinkaku-ji, Kyoto"));
        list.add(new BoxMail(4,"Chinese",100,false,"China World Mall,Bắc Kinh"));
        listLanguages = new ArrayList<>();
        listLanguages.add("English");
        listLanguages.add("Vietnamese");
        listLanguages.add("Japanese");
        listLanguages.add("Chinese");
        listSize = new ArrayList<>();
        listSize.add(5);
        listSize.add(10);
        listSize.add(15);
        listSize.add(25);
        listSize.add(50);
        listSize.add(100);
    }

    @Override
    public List<BoxMail> findAll() {
        return list ;
    }

    @Override
    public BoxMail findById(int id) {
        return list.get(id-1);
    }

    @Override
    public void update(BoxMail boxMail) {
        for (BoxMail mail : list) {
            if (mail.getId()==boxMail.getId()){
                mail.setLanguages(boxMail.getLanguages());
                mail.setSignature(boxMail.getSignature());
                mail.setSpamsFilter(boxMail.isSpamsFilter());
                mail.setSize(boxMail.getSize());
            }
        }
    }

    @Override
    public List<String> showListLanguages() {
        return listLanguages;
    }

    @Override
    public List<Integer> showListPageSize() {
        return listSize;
    }
}
