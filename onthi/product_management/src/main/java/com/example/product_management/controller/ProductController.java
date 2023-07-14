package com.example.product_management.controller;

import com.example.product_management.entity.Product;
import com.example.product_management.service.ICategoryService;
import com.example.product_management.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;

    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/list")
    public String showList(Model model) {
        model.addAttribute("products", productService.findAll());
        return "/view/product/list";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("product", new Product());
        model.addAttribute("categories", categoryService.findAll());
        return "/view/product/create";
    }

    @PostMapping("/create")
    public String doCreate(@Validated @ModelAttribute("product") Product product,
                           BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()) {
            model.addAttribute("categories", categoryService.findAll());
            return "/view/product/create";
        }
        product.setCategory(categoryService.findById(product.getCategory().getCategoryId()));
        productService.create(product);
        return "redirect:/product/list";
    }
    @GetMapping("/detail/{id}")
    public String showDetail(Model model,
                             @PathVariable("id") int id) {
        Product product = productService.findById(id);
        model.addAttribute("product", product);
        return "/view/product/detail";
    }
    @GetMapping("/delete/{id}")
    public String delete( @PathVariable("id") int id){
        productService.deleteById(id);
        return "redirect:/product/list";
    }
    @GetMapping("/update")
    public String showUpdate(@RequestParam("id") int id, Model model) {
        model.addAttribute("product", productService.findById(id));
        model.addAttribute("categories", categoryService.findAll());
        return "/view/product/update";
    }

    @PostMapping("/update")
    public String doUpdate(@ModelAttribute("product") Product product) {
//        product.setCategory(categoryService.findById(product.getCategory().getCategoryId()));
        productService.update(product);
        return "redirect:/product/list";
    }

}
