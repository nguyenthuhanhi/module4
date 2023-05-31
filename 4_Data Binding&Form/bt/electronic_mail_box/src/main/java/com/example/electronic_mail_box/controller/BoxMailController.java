package com.example.electronic_mail_box.controller;

import com.example.electronic_mail_box.model.BoxMail;
import com.example.electronic_mail_box.service.IBoxMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("mailBox")
public class BoxMailController {

    @Autowired
    private IBoxMailService service;

    @GetMapping("list")
    public String showList(Model model){
        model.addAttribute("listMainBox",service.findAll());
        return "list";
    }

    @GetMapping("update/{id}")
    public String showUpdate(@PathVariable int id, Model model){
        model.addAttribute("listSize",service.showListPageSize());
        System.out.println(service.showListPageSize());
        model.addAttribute("listLanguages",service.showListLanguages());
        System.out.println(service.showListLanguages());
        model.addAttribute("mailBox",service.findById(id));
        return "update";
    }
    @PostMapping("update")
    public String update(@ModelAttribute("mailBox") BoxMail boxMail , Model model){
        System.out.println(boxMail.getId());
        System.out.println(boxMail.getSignature());
        System.out.println(boxMail.getSize());
        System.out.println(boxMail.getLanguages());
        System.out.println(boxMail.isSpamsFilter());
        service.update(boxMail);
        return "redirect:/mailBox/list";
    }

}
