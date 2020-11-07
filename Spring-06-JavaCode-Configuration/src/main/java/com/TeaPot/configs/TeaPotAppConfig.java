package com.TeaPot.configs;

import com.TeaPot.services.Java;
import com.TeaPot.services.Selenium;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.TeaPot")
public class TeaPotAppConfig{

    //Another way to create bean, NO need to write @Component in Java and Selenium classes
    //@Bean public Java java(){ return new Java();}
    //@Bean public Selenium selenium(){ return new Selenium();}

}
