package com.sample.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AppController {

	@RequestMapping(path = "/list", method = RequestMethod.GET)
	public ModelAndView getlistofUsers(ModelMap model) {
		// ModelAndView modelAndView=new ModelAndView();
		model.addAttribute("greetings", "Welcome to Spring MV");

		return new ModelAndView("userlist");
	}

}
