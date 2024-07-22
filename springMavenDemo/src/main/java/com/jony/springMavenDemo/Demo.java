package com.jony.springMavenDemo;

import lombok.Data;


public class Demo {
	private int id;
	private String name;
	
	
	
	/*public Demo(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}*/



	public int getId() {
		return id;
	}

	

	public String getName() {
		return name;
	}



	public void m(){
		System.out.println("Hello");
		
	}

}
