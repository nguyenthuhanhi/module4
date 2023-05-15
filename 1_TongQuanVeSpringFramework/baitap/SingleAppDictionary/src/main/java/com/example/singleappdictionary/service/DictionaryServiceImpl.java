package com.example.singleappdictionary.service;

import java.util.HashMap;
import java.util.Map;

public class DictionaryServiceImpl implements IDictionaryService{
    private static Map<String,String> map= new HashMap<>();
    static {
        map.put("tree","cây");
        map.put("apple","táo");
        map.put("peach","đào");
        map.put("t-shirt","áo");
        map.put("laptop","máy tính");
        map.put("people","người");
        map.put("table","bàn");
    }


    @Override
    public String dictionary(String english) {
        if(map.containsKey(english.toLowerCase())){
            return map.get(english.toLowerCase());
        } else {
            return "NO FIND";
        }
    }
}
