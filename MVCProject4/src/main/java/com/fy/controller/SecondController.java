package com.fy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class SecondController {
	@RequestMapping("/firstpage")
	public String hello1() {
		return "secondpage";
	}
	
	@RequestMapping("/process")
	public String hello2() {
		return "thirdpage";
	}
}
