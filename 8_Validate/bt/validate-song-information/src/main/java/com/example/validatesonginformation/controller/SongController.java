package com.example.validatesonginformation.controller;


import com.example.validatesonginformation.entity.Song;
import com.example.validatesonginformation.service.ISongService;
import com.example.validatesonginformation.validate.SongValidate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SongController {
    @Autowired
    private ISongService service;


    @GetMapping("/list")
    public String showList(Model model){
        model.addAttribute("song", service.findAll());
        return "/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model){
        model.addAttribute("song",new Song());
        return "/create";
    }
     @PostMapping("/create")
    public String doCreate(@Validated @ModelAttribute("song") Song song,
                           BindingResult bindingResult, Model model){
        SongValidate validate= new SongValidate();
         if (service.findById(song.getId())!=null){
             validate.validate(song, bindingResult);
         }
         if (bindingResult.hasFieldErrors()) {
             return "/create";
         }

        service.create(song);
        return "redirect:/list";
     }

     @GetMapping("/update{id}")
    public  String showUpdate(Model model, @PathVariable("id") int id){
        Song song= service.findById(id);
        model.addAttribute("song", song);
        return "/update";
     }

     @PostMapping("/update")
    public  String  doUpdate( Model model, @ModelAttribute("song") Song song){
        service.update(song);
        return "redirect:/list";
     }

}
