package com.TeaPot.interfaces;

import com.TeaPot.interfaces.interfaces.Courses;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeaPotApp {
    public static void main(String[] args) {
        ApplicationContext container = new ClassPathXmlApplicationContext("config.xml");

        Courses course = (Courses) container.getBean("java");

        course.getTeachingHours(); //prints init and then accordingly teaching hours

        ((ClassPathXmlApplicationContext)container).close();    //need downcasting
    }
}
