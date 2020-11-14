package com.teapot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping  //@RequestMapping("/") -> Default
    public String getRequestMapping(){

        return "home";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/secil")
    public String getRequestMapping2(){

        return "home";
    }

    @RequestMapping("/teapot")
    public String getRequestMapping3(){

        return "home";
        //when we run http://localhost:8080/teapot  home.html would come
    }

    //for application user interface design we only use get and post

    @GetMapping("/spring")
    public String getRequestMappingEx(){

        return "home";
    }

    @PostMapping("/spring")
    public String getRequestMappingEx2(){

        return "home";
    }

}
