package com.TeaPot;

import com.TeaPot.configs.TeaPotAppConfig;
import com.TeaPot.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TeaPotApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(TeaPotAppConfig.class);

        Course course = container.getBean("java", Course.class);
        course.getTeachingHours();

        System.out.println(course.toString());


    }
}
