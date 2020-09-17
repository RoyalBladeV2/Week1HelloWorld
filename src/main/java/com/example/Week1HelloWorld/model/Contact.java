package com.example.Week1HelloWorld.model;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class Contact {
	@RequestMapping("/contact")
	public String ContactInfo() {
		return "This is the contact page, if you need any info you'll find it here.";
	}
}