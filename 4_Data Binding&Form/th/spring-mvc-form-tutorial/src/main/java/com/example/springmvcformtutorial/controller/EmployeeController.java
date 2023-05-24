package com.example.springmvcformtutorial.controller;


import com.example.springmvcformtutorial.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("employee/")
public class EmployeeController {
    @GetMapping("showForm")
    public String showForm( Model model){
       model.addAttribute("employee",new Employee());
       return "employee/create";
    }

    @PostMapping("addEmployee")
    public String submit(@ModelAttribute("employee") Employee employee, Model model){
        model.addAttribute("name", employee.getName());
        model.addAttribute("contactNumber", employee.getContactNumber());
        model.addAttribute("id", employee.getId());
        return "employee/info";
    }
}
