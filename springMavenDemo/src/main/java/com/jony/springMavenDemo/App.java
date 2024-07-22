package com.jony.springMavenDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jony.di.Car;

public class App{
    public static void main( String[] args ){
        
    	ApplicationContext context= new ClassPathXmlApplicationContext("spring.xml");
    	Car car = context.getBean(Car.class);
    	car.drive();
    	
    	
    	
    		
    }
}
