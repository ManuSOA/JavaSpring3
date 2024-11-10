package com.manuel.curso.springboot.webapp.springboot_web.controllers;

import com.manuel.curso.springboot.webapp.springboot_web.models.User;
import com.manuel.curso.springboot.webapp.springboot_web.models.dto.UserDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserRestController {

    @GetMapping("/details")
    public UserDto details() {

        UserDto userDto = new UserDto();
        User user = new User("Manuel", "Jimenez");
        userDto.setUser(user);
        userDto.setTitle("HOLA MUNDO SPRING BOOT");

        //detail con map
        /**Map<String,Object> response = new HashMap<>();
         response.put("title", "HOLA MUNDO SPRING BOOT");
         response.put("user", user);*/
        return userDto;
    }

    @GetMapping("/list-user")
    public List<User> list() {
        User user = new User("Manuel", "Jimenez");
        User user2 = new User("Marta", "culo");
        User user3 = new User("Maximo", "incha");

        List<User> users = Arrays.asList(user,user2,user3);

        return users;
    }

}
