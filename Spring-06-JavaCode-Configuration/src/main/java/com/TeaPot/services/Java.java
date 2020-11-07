package com.TeaPot.services;

import com.TeaPot.interfaces.Course;
import com.TeaPot.interfaces.ExtraSessions;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    private ExtraSessions extraSessions;

    @Override
    public void getTeachingHours() {
        System.out.println("Teaching hours: " + (30+extraSessions.getHours()));
    }
}
