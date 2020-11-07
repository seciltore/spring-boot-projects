package com.TeaPot.services;

import com.TeaPot.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {
    @Override
    public void getTeachingHours() {
        System.out.println("Teaching hours 22");
    }
}
