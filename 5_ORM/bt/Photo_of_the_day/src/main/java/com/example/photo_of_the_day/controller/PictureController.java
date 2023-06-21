package com.example.photo_of_the_day.controller;


import com.example.photo_of_the_day.entity.Picture;
import com.example.photo_of_the_day.service.IPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Controller
public class PictureController {
    @Autowired
    private IPictureService service;

    @GetMapping("/list")
    public String showPicture(Model model){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate today= LocalDate.now();
        String todayString = today.format(formatter);
        model.addAttribute("pictures",service.findAllToday(todayString));
        model.addAttribute("picture",new Picture());
        return "/list";
    }

    @PostMapping("/savePicture")
    public String savePicture (@ModelAttribute("picture") Picture picture){
        service.addPicture(picture);
        return "redirect:/list";
    }
    @GetMapping("/likePicture{id}")
    public String likePicture(Model model,@PathVariable("id") int id){
        service.addLike(service.findById(id));
        return "redirect:/list";
    }

}
