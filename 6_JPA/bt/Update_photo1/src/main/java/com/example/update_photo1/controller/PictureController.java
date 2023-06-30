package com.example.update_photo1.controller;


import com.example.update_photo1.entity.Picture;
import com.example.update_photo1.service.IPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

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

    @PostMapping("/create")
    public String doCreate (@ModelAttribute("picture") Picture picture){
        service.create(picture);
        return "redirect:/list";
    }
    @GetMapping("/likePicture{id}")
    public String likePicture(Model model,@PathVariable("id") int id){
        service.addLike(service.findById(id));
        return "redirect:/list";
    }

}
