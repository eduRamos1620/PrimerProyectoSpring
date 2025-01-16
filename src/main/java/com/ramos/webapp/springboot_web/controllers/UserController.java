package com.ramos.webapp.springboot_web.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.ramos.webapp.springboot_web.models.User;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){
        User user = new User("Eduardo", "Ramos");
        user.setEmail("correo@correo.com");
        model.addAttribute("title", "Hola Mundo desde Spring");
        model.addAttribute("user", user);
        return "details";
    }

    @GetMapping("list")
    public String list(ModelMap model) {
        List<User> users = new ArrayList<>();
        model.addAttribute("title", "Lista de usuarios");
        model.addAttribute("users", users);
        return "list";
    }
    
}
