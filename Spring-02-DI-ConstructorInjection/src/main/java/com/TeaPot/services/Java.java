package com.TeaPot.services;

import com.TeaPot.interfaces.Courses;

public class Java implements Courses {

    OfficeHours officeHours;

    public Java(OfficeHours officeHours) {
        this.officeHours = officeHours;
    }

    @Override
    public void getTeachingHours() {
        System.out.println("Teaching hours : " + (20 + officeHours.getHours()));
    }
}
