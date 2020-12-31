package com.ensim.TP5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="nameGet", required = false, defaultValue = "World") String nameGet, Model model) {
		model.addAttribute("nomTemplate", nameGet);
		return "greeting";
	}
	
}
