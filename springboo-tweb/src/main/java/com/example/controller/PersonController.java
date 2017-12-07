package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.model.Person;

@Controller
public class PersonController {

	
	@ResponseBody  // render text
	@RequestMapping("/text")
	public String rendeText() {
		return "render text";
	}
		
	@RequestMapping("/")
	String index() {
		return "index";
	}
	
	@RequestMapping("/person")
	public String Persion(Model model) {
		
		Person p = new Person();
		p.setFirstName("vijay");
		p.setLastName("kumar");
		p.setAge(35);
		model.addAttribute("person", p);
		return "person";
	}
}
