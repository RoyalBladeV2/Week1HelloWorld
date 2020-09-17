package com.example.Week1HelloWorld.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class DefaultURL {
	@RequestMapping({"/", "*", ""})
	public String Error() {
		return "You've landed on an unavailable URL, try again!";
	}
}
