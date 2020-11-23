package com.teapot.controller;

import com.teapot.enums.Gender;
import com.teapot.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/mentor")
public class MentorController {

    @GetMapping("/list")
    public String showTable(Model model){

        List<Mentor> mentorList = new ArrayList<>();
        mentorList.add(new Mentor("John", "Doe", 45, Gender.MALE));
        mentorList.add(new Mentor("Mike", "Smith", 39, Gender.MALE));
        mentorList.add(new Mentor("Amy", "Brown", 43, Gender.FEMALE));

        model.addAttribute("mentors", mentorList);


        return "/mentor/mentor-list";
    }
}
