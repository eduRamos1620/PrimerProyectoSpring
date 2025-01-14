package com.ramos.webapp.springboot_web.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public Map<String, Object> details(Model model){
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola Mundo desde Spring");
        body.put("name", "Eduardo");
        body.put("lastname", "Ramos");
        return body;
    }
}
