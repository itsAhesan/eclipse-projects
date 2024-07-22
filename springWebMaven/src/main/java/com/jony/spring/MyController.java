package com.jony.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	@RequestMapping("/link1")
	public String m1(){
		return "resp1.jsp";
	}
	@RequestMapping("/link2")
	public String m2(){
		return "resp2.jsp";
	}

}
