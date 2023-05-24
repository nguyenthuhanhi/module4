package com.example.caculator.controller;


import com.example.caculator.service.ICaculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Caculator {
    @Autowired
    ICaculatorService caculatorService;
    @GetMapping("")
    public String calculate(){
        return "calculate";
    }
    @PostMapping("caculator")
    public String caculator(@RequestParam("calculation1") double calculation1,
                            @RequestParam("calculation2") double calculation2,
                            @RequestParam("calculation") String calculation, Model model){
        model.addAttribute("calculation1",calculation1);
        model.addAttribute("calculation1",calculation1);
        model.addAttribute("result", caculatorService.caculator(calculation1, calculation2, calculation));
        return "calculate";
    }
}
