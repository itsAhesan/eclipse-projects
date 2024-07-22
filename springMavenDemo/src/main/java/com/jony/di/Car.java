package com.jony.di;

import lombok.Data;

@Data
public class Car {
	
	Engine e;
	
	private String name;


	public void drive(){
		e.start();
		System.out.println(name+" Start Driving");
	}
	
	

}
