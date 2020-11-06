package com.TeaPot.services;


import com.TeaPot.interfaces.Course;
import com.TeaPot.interfaces.ExtraSessions;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
//@AllArgsConstructor
public class Java implements Course {

    //Field Injection
    @Autowired
    // private OfficeHours officeHours;
    private ExtraSessions extraSessions;  //make it loosely couple


    /*
    //Constructor Injection
    @Autowired
    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

     */

    /*
    //Setter Injection
    @Autowired
    public void setOfficeHours(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

     */


    @Override
    public void getTeachingHours() {
        System.out.println("Weekly hours : " + (30 + extraSessions.getHours()));

    }
}
