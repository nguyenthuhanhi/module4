package com.example.update_photo2.controller;


import com.example.update_photo2.entity.Picture;
import com.example.update_photo2.service.IPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.awt.print.Pageable;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Controller
public class PictureController {
    @Autowired
    private IPictureService service;

//    @GetMapping("/list")
//    public String showPicture(Model model){
//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        LocalDate today= LocalDate.now();
//        String todayString = today.format(formatter);
//        model.addAttribute("pictures",service.findAllToday(todayString));
//        model.addAttribute("picture",new Picture());
//        return "/list";
//    }
    @GetMapping("/list")
    public String showPicture(@RequestParam(name="page", defaultValue = "0") int page, Model model){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate localDate= LocalDate.now();
        String todayString = localDate.format(formatter);
        model.addAttribute("pictures",service.findAllToday(todayString,  PageRequest.of(page,3)));
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
