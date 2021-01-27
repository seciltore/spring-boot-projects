package com.orm3.services;

import com.orm3.interfaces.Course;
import org.springframework.stereotype.Component;

@Component
public class Selenium implements Course {
    @Override
    public int getTeachingHours() {
        return 7;
    }
}
