package com.TeaPot.configs;

import com.TeaPot.interfaces.ExtraSessions;
import com.TeaPot.services.Java;
import com.TeaPot.services.OfficeHours;
import com.TeaPot.services.Selenium;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.TeaPot")
@PropertySource("classpath:application.properties")
public class TeaPotAppConfig{

    //Another way to create bean, NO need to write @Component in Java and Selenium classes
    @Bean
    public Java java(){
        return new Java(extraSessions());
    }

    @Bean
    public Selenium selenium(){
        return new Selenium();
    }
/*
    //@Bean
    public OfficeHours officeHours(){
        return new OfficeHours();
    }
 */

    //@Bean
    public ExtraSessions extraSessions(){
        return new OfficeHours();
    }
}
