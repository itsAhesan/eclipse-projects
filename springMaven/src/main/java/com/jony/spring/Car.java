package com.jony.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

import lombok.Data;


@Data
@Component
public class Car {
	
	@Autowired
	Engine eng;
	@Value("BMW")
	private String name;
	

	public void drive() {
		 eng.start();
		System.out.println(name+" You can Drive...");
	}
}
