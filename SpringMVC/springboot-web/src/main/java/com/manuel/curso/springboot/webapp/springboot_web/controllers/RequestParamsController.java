package com.manuel.curso.springboot.webapp.springboot_web.controllers;

import com.manuel.curso.springboot.webapp.springboot_web.models.dto.ParamDTO;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/params")
@Component
public class RequestParamsController {

    @GetMapping("/foo")
    public ParamDTO foo(@RequestParam(name = "mensaje", required = false, defaultValue = "sin Valor") String message){

        ParamDTO param = new ParamDTO();
        param.setMessage(message);

        return param;
    }

    @GetMapping("/bar")
    public ParamDTO bar(@RequestParam String text, @RequestParam Integer code){

        ParamDTO params = new ParamDTO();
        params.setMessage(text);
        params.setCode(code);

        return  params;
    }

    @GetMapping("/request")
    public ParamDTO request(HttpServletRequest httpRequest){

        Integer code = 0;

        try {
            code = Integer.parseInt(httpRequest.getParameter("code"));
        }catch (NumberFormatException ignored){
        }

        ParamDTO params = new ParamDTO();
        params.setMessage(httpRequest.getParameter("text"));
        params.setCode(code);

        return  params;
    }





}
