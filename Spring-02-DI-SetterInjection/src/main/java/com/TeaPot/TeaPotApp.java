package com.TeaPot;

import com.TeaPot.interfaces.Courses;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TeaPotApp {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Courses courses = (Courses) container.getBean("selenium");

        courses.getTeachingHours();

    }
}
