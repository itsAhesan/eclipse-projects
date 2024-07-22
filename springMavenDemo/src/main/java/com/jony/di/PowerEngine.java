package com.jony.di;

import lombok.Data;

@Data
public class PowerEngine implements Engine{
	private String name;
	
	
	public void start() {
		System.out.println(name+" Started");
		
	}
	

}
