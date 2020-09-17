package com.example.Week1HelloWorld.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {
	@RequestMapping("/index")
	public String Greeting(@RequestParam(value = "name", defaultValue = "Yannick", required = false) String Name, @RequestParam(value = "location", defaultValue = "Belgium", required = false) String Location) {
		return "Welcome to the main page, " + Name + "! What a pleasure to have you here all the way from " + Location + "!";
	}
}

