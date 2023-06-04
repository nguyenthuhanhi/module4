package com.example.product_management_thymeleaf.controller;


import com.example.product_management_thymeleaf.model.Product;
import com.example.product_management_thymeleaf.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("/list")
    public String showList(Model model) {
        model.addAttribute("products", productService.findAll());
        return "/list";
    }

    @GetMapping("/detail/{id}")
    public String showDetail(Model model,
                             @PathVariable("id") int id) {
        model.addAttribute("products",productService.findById(id));
        return "/detail";
    }
    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("products", new Product());
        return "/create";
    }
    @PostMapping("/create")
    String doCreate(@ModelAttribute("products") Product product,Model model ) {
        productService.create(product);
        return "redirect:/product/list";
    }
    @GetMapping("/update/{id}")
    String showUpdate(Model model, @PathVariable("id") int id) {
        model.addAttribute("products", productService.findById(id));
        return "/update";
    }
    @PostMapping("/update")
    String doUpdate(@ModelAttribute("products") Product product) {
        productService.update(product);
        return "redirect:/product/list";
    }
    @GetMapping("/delete/{id}")
    String doDelete(Model model, @PathVariable("id") int id) {
        productService.remove(productService.findById(id));
        return "redirect:/product/list";
    }

    @PostMapping("/searchByName")
    String doSearch(@RequestParam("name") String name,Model model){
        List<Product> list= new ArrayList<>();
        list.add(productService.findByName(name));
        model.addAttribute("products",list);
        return "/list";
    }


}
