package com.TeaPot.services;

import com.TeaPot.interfaces.Course;
import com.TeaPot.interfaces.ExtraSessions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Java implements Course {


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
