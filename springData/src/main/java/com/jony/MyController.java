package com.jony;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

import com.jony.dao.DAO;
import com.jony.model.Model;

@Controller("/")
public class MyController {
	
	@Autowired
	private DAO dao;
	
	
	@RequestMapping("/reg")
	public ModelAndView reg(@ModelAttribute Model m){
		System.out.println(m);
		
		dao.save(m);
		
		return new ModelAndView("res", "user", m);
		
		
		
	}
	

}
