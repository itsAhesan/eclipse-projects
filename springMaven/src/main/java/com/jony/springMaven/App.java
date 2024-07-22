package com.jony.springMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jony.spring.Car;

public class App {
    public static void main( String[] args ){
        ApplicationContext con= new ClassPathXmlApplicationContext("spring.xml");
        Car car = con.getBean(Car.class);
        car.drive();
        
                
        
    
    
    
    }
}
