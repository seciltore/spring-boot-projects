package com.TeaPot;

import com.TeaPot.interfaces.Courses;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TeaPotApp {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Courses courses1 = (Courses) container.getBean("java");

        Courses courses2 = (Courses) container.getBean("java");

        System.out.println("Pointing to the same object: " + (courses1 == courses2));

        System.out.println("Memory location for the course1: " + courses1);

        System.out.println("Memory location for the course2: " + courses2);


    }
}
