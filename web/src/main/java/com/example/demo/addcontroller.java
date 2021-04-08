package com.example.demo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class addcontroller {

	@RequestMapping("add")
	  public ModelAndView addinfo( HttpServletRequest req,@RequestParam("name") String name) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("display");
		mv.addObject("name",name);
		
		return mv;
	  }
}
