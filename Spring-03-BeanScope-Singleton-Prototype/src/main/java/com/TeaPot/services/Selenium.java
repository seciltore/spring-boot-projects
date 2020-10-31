package com.TeaPot.services;

import com.TeaPot.interfaces.Courses;

public class Selenium implements Courses {
    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours: 20");
    }
}
