package com.jony.spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Data;

@Data
@Component
public class Engine {
	@Value("Turbo")
	private String name;
	 void start(){
		System.out.println(name +" Engine Stared");
	}

}
