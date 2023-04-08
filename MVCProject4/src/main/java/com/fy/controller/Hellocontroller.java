package com.fy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class Hellocontroller {
	@RequestMapping("hello")
	public String hello() {
		return "firstpage";
	}
}
