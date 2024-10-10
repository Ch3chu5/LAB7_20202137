package com.example.lab7.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @GetMapping("/inicio")
    public String mostrarInicio(){
        return "Admin/inicio-a";
    }
}
