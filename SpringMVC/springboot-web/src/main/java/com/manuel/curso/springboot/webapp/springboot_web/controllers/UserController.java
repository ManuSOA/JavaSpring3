package com.manuel.curso.springboot.webapp.springboot_web.controllers;

import com.manuel.curso.springboot.webapp.springboot_web.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class UserController {

    @GetMapping("/details")
    public String details(Model model){

        User user = new User("Manuel","Jimenez");

        model.addAttribute("title", "HOLA MUNDO SPRING BOOT");
        model.addAttribute("user", user);

        return "details";
    }

    @GetMapping("/list-user")
    public String list(ModelMap modelMap) {
        User user = new User("Manuel", "Jimenez");
        User user2 = new User("Marta", "culo");
        User user3 = new User("Maximo", "incha");

        List<User> users = Arrays.asList(user,user2,user3);

        modelMap.addAttribute("users",users);
        modelMap.addAttribute("title","Listado de Usuarios");
        return "list";
    }

}
