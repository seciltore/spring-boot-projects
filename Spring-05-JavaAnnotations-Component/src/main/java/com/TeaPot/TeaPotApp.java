package com.TeaPot;

import com.TeaPot.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeaPotApp {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Course course = (Course) container.getBean("API");
        Course course2 = (Course) container.getBean("java");

        course2.getTeachingHours();


    }
}
