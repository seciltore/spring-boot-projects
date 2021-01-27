package com.orm3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping  //@RequestMapping("/") -> Default
    public String getRequestMapping() {

        return "home";
    }

    @RequestMapping(method = RequestMethod.GET, value = "/secil")
    public String getRequestMapping2() {

        return "home";
    }

    @RequestMapping(method = RequestMethod.POST, value = "/teapot")
    public String getRequestMapping3() {

        return "home";
        //when we run http://localhost:8080/teapot  home.html would come
    }

    //for application user interface design we only use get and post

    @GetMapping("/spring")
    public String getRequestMappingEx() {

        return "home";
    }

    @PostMapping("/spring")
    public String getRequestMappingEx2() {

        return "home";
    }

    @GetMapping("/home/{name}")
    public String pathVariableEx(@PathVariable("name") String name) {

        System.out.println("name is: " + name);
        return "home";
    }

    //http://localhost:8080/home/teapot

    @GetMapping("/home/{name}/{email}")
    public String pathVariableEx2(@PathVariable("name") String name, @PathVariable("email") String email) {

        System.out.println("name is: " + name);
        System.out.println("email is: " + email);
        return "home";
    }
    //http://localhost:8080/home/secil@teapot.com

    @GetMapping("home/course")
    public String requestParamEx(@RequestParam("course") String course) {
        System.out.println("name is : " + course);
        return "home";
    }
    //http://localhost:8080/home/course?course=spring -> query param

    //http://localhost:8080/home/spring -> requestparam


    @GetMapping(value = "/course")
    public String requestParamEx2(@RequestParam(value = "name", required = false, defaultValue = "teapot") String name) {
        System.out.println("name is : " + name);
        return "home";
    }
    //http://localhost:8080/course


}
