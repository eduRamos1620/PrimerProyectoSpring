package com.ramos.webapp.springboot_web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        model.addAttribute("title", "Hola Mundo desde Spring");
        model.addAttribute("name", "Eduardo");
        model.addAttribute("lastname", "Ramos");
        return "details";
    }
}
