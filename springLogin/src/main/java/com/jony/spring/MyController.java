package com.jony.spring;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.jony.spring.dao.DAO;
import com.jony.spring.model.UserDTO;

@Controller("/")
public class MyController {
	
	@Autowired
	private DAO dao;
	
		
	@RequestMapping(value="/link1" , method= RequestMethod.POST)
	public String m1(@RequestParam String user, @RequestParam String pass){
		if(user.equals("Jony") && pass.equals("1122")){
			
			return "res1";
		}else {
			return "res2" ;
		}
	}
		
			
	
	
	@RequestMapping("/link2")
	public String m2(@ModelAttribute UserDTO dto){
		System.out.println(dto);
		
		
		return "res3";
		
	}
	
	@RequestMapping(value="/link3" , method= RequestMethod.POST)
	public ModelAndView m3(@RequestParam String user, @RequestParam String pass){
		if(user.equals("Jony") && pass.equals("1122")){
			
			return new ModelAndView ("res4","msg","Login success "+user);
			//              		view name , key ,  value
		}
			return new ModelAndView ("res4","msg","Login Failed ");
		}
	
	@RequestMapping("/link4")
	public ModelAndView m4(@ModelAttribute UserDTO dto){
		System.out.println(dto);
		dao.saveDTO(dto);
		
		
		return new ModelAndView("res5", "user", dto);
	}
	@RequestMapping("/link5")
	public ModelAndView m5(){
	
		
		UserDTO dto1 = new UserDTO();
		dto1.setUser("Ahesan");
		
		UserDTO dto2 = new UserDTO();
		dto2.setUser("Rahat");
		
		UserDTO dto3 = new UserDTO();
		dto3.setUser("JK");
		
		ArrayList<UserDTO> list= new ArrayList<UserDTO>();
		list.add(dto1);
		list.add(dto2);
		list.add(dto3);
		
		
		
		return new ModelAndView("res6", "list", list);
		
	}
	
	
}
