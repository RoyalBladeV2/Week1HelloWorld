package com.example.Week1HelloWorld.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class MainPage {
	@RequestMapping("/main")
	public String Main() {
		return "Welcome to the main page!";
	}
}
