package com.TeaPot.interfaces.services;

import com.TeaPot.interfaces.interfaces.Courses;

public class Java implements Courses {

    @Override
    public void getTeachingHours() {
        System.out.println("Weekly Teaching Hours : 20");
    }

    public void myInitMethod(){
        System.out.println("Executing the init method");
    }

    public void myDestroyMethod(){
        System.out.println("Executing the destroy method");
    }
}
