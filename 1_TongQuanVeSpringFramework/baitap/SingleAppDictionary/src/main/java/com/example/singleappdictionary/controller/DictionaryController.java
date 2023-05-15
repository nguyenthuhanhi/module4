package com.example.singleappdictionary.controller;


import com.example.singleappdictionary.service.IDictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.management.modelmbean.ModelMBean;

@Controller
public class DictionaryController {
    @Autowired
    IDictionaryService service;

    @GetMapping("")
    public String lexicon(){
        return "index";
    }
    @PostMapping("dictionary")
    public String dictionary(@RequestParam String english, Model model){
        model.addAttribute("english",english);
        model.addAttribute("vns",service.dictionary(english));
        return "index";
    }
}
