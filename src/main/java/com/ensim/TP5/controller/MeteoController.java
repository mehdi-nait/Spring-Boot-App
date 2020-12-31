package com.ensim.TP5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MeteoController {
	
	@RequestMapping(value="/meteo", method=RequestMethod.POST)
	public String showMeteo(@RequestParam("input_addr") String myAddress,Model model) {
		model.addAttribute("myAddress", myAddress);
		return "meteo";
	}
}
