package com.TeaPot.services;

import com.TeaPot.interfaces.Course;
import com.TeaPot.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class Java implements Course {

    @Value("SF-1")
    private String classroom;

    @Value("${instructor}")
    private String instructor;

    @Value("${days}")
    private String[] days;


    @Override
    public String toString() {
        return "Java{" +
                "classroom='" + classroom + '\'' +
                ", instructor='" + instructor + '\'' +
                ", days=" + Arrays.toString(days) +
                '}';
    }

    //@Autowired
    //@Qualifier("officeHours")
    private ExtraSessions extraSessions;


    //@Autowired  //-> not need anymore after the update of Spring framework
    public Java(@Qualifier("officeHours") ExtraSessions extraSessions) {
        this.extraSessions = extraSessions;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly teaching hours : " + (20 + extraSessions.getHours()));
    }
}
