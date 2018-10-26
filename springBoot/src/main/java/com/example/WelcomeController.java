package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController 
{
	@RequestMapping("/")
	public String welcome(ModelAndView model)
	{
		System.out.println("HI");
		return "welcome";
	}

}
