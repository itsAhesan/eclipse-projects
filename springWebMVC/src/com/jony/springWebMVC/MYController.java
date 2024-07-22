package com.jony.springWebMVC;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/")
@Component
public class MYController {
	
	@RequestMapping("/link1")
	public String m1(){
		return "link1.html";
	}
	
	@RequestMapping("/link2")
	public String m2(){
		return "link2.html";
	}
	

}
