package com.orm3.services;

import com.orm3.interfaces.Course;
import com.orm3.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {

    @Value("${instructor}")
    private String instructorName;

    private ExtraSessions extraSession;

    @Autowired
    public Java(ExtraSessions extraSession) {
        this.extraSession = extraSession;
    }

    @Override
    public int getTeachingHours() {
        return 20 + extraSession.getHour();
    }
}