package com.example.music_player_app.controller;


import com.example.music_player_app.entity.MusicPlayer;
import com.example.music_player_app.service.IMusicPlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MusicPlayerController {
    @Autowired
    private IMusicPlayerService service;

    @GetMapping("/list")
    String showList(Model model) {
        model.addAttribute("listMusic", service.findAll());
        return "/list";
    }
    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("musicPlayer", new MusicPlayer());
        return "/create";
    }

    @PostMapping("/create")
    public String doCreate(@ModelAttribute("musicPlayer") MusicPlayer musicPlayer) {
        service.create(musicPlayer);
        return "redirect:/list";
    }
    @GetMapping("/update/{id}")
    public String showUpdate(Model model,@PathVariable("id") int id) {
        model.addAttribute("musicPlayer", service.findById(id));
        return "/update";
    }

    @PostMapping("/update")
    public String doUpdate(@ModelAttribute("musicPlayer") MusicPlayer musicPlayer) {
        service.update(musicPlayer);
        return "redirect:/list";
    }
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id) {
        service.delete(id);
        return "redirect:/list";
    }
}
