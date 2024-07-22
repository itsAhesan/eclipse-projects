package com.jony.springWEB;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Component
public class Controller {
	
	@RequestMapping("/link1")
	public String m1(){
		return "res1.jsp";
	}
	
	@RequestMapping("/link2")
	public String m2(){
		return "res2.jsp";
		
	}
	
}
