package com.TeaPot;

import com.TeaPot.config.TeaPotAppConfig;
import com.TeaPot.interfaces.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TeaPotApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(TeaPotAppConfig.class);

        Course course = container.getBean("java", Course.class);

        course.getTeachingHours();

        ((AnnotationConfigApplicationContext)container).close();

    }
}
