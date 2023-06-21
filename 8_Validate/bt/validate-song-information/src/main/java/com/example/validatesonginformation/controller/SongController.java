package com.example.validatesonginformation.controller;


import com.example.validatesonginformation.service.ISongService;
import com.example.validatesonginformation.validate.SongValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SongController {
    @Autowired
    private ISongService service;
    @Autowired
//    private SongValidate validate;

    @GetMapping("/list")
    public String showList(Model model){
        model.addAttribute("song",service.findAll());
        return "/list";
    }


}
