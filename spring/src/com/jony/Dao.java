package com.jony;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Dao {

	public static void main(String[] args) {
		ApplicationContext con= new ClassPathXmlApplicationContext("spring.xml");
		BeanDemo bean = con.getBean(BeanDemo.class);
		System.out.println(bean);
		bean.m();

	}

}
