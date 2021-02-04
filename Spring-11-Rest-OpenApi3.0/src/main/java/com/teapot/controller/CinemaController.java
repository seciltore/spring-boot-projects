package com.teapot.controller;

import com.teapot.entity.Cinema;
import com.teapot.repository.CinemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cinema")
public class CinemaController {
    @Autowired
    private CinemaRepository cinemaRepository;

    @GetMapping
    public List<Cinema> readAll(){
        return cinemaRepository.findAll();
    }
}
