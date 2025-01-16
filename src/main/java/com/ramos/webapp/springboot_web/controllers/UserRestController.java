package com.ramos.webapp.springboot_web.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ramos.webapp.springboot_web.models.User;
import com.ramos.webapp.springboot_web.models.DTO.UserDTO;
//import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/api")
public class UserRestController {
    @GetMapping("/details")
    public UserDTO details(){
        UserDTO userdto = new UserDTO();
        User user = new User("Eduardo", "Ramos");
        userdto.setUser(user);
        userdto.setTitle("Hola Mundo desde Spring");
        return userdto;
    }

    @GetMapping("/list")
    public List<User> list(){
        User user = new User("Eduardo", "Ramos");
        User user2 = new User("Heidy", "Rodriguez");
        User user3 = new User("Charles", "Ramos");

        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(user2);
        users.add(user3);

        return users;
    } 

    @GetMapping("/details-map")
    public Map<String, Object> detailsMap(Model model){
        User user = new User("Eduardo", "Ramos");
        Map<String, Object> body = new HashMap<>();
        body.put("title", "Hola Mundo desde Spring");
        body.put("user", user);
        return body;
    }
}
