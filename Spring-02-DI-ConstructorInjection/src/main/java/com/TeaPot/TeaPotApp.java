package com.TeaPot;

import com.TeaPot.interfaces.Courses;
import com.TeaPot.services.Java;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TeaPotApp {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Courses courses = (Courses) container.getBean("java");

        ((Java)courses).x = 5;
        courses.getTeachingHours();

    }
}
