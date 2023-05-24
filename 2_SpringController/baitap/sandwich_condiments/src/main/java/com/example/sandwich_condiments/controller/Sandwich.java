package com.example.sandwich_condiments.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Sandwich {
    @GetMapping("")
    public String list(){
    return "list";
    }
    @PostMapping("sandwich")
    public String save(@RequestParam("condiment") String[] condiment, Model model) {
        model.addAttribute("save", condiment);
        return "save";
    }


}
