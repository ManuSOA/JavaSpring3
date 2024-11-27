package com.manuel.curso.springboot.webapp.springboot_web.controllers;

import com.manuel.curso.springboot.webapp.springboot_web.models.User;
import com.manuel.curso.springboot.webapp.springboot_web.models.dto.ParamDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/var")
public class PathVariableController {

    @Value("${config.username}")
    private String username;
    //@Value("${config.message}")
    private String message;
    @Value("${config.code}")
    private Integer code;
    @Value("${config.listOfValues}")
    private List<String> listOfValues;
    @Value("#{${config.valuesMap}}")
    private Map<String,Object> valuesMap;

    @Autowired
    private Environment env;


    @GetMapping("/baz/{message}")
    public ParamDTO baz(@PathVariable String message) {
        ParamDTO param = new ParamDTO();

        param.setMessage(message);

        return param;
    }


    @GetMapping("/mix/{message}/{id}")
    public Map<String, Object> mixPathVar(@PathVariable String message, @PathVariable Long id) {

        Map<String, Object> json = new HashMap<String, Object>();

        json.put("code",id);
        json.put("message", message);

        return json;
    }

    @PostMapping("/create")
    public User create(@RequestBody User user){

        //Hacer alo con el user
        user.setName(user.getName().toUpperCase());
        return user;
    }

    @GetMapping("/values")
    public Map<String, Object> values(@Value("${config.message}")String message) {

        Map<String, Object> json = new HashMap<String, Object>();

        json.put("name", username);
        json.put("code",code);
        json.put("message", message);
        json.put("message2", env.getProperty("config.message"));
        json.put("listOfValues", listOfValues);
        json.put("valueMap", valuesMap);

        return json;
    }
}
