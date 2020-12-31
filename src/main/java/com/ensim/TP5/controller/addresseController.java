package com.ensim.TP5.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ensim.TP5.model.Address;

@Controller
public class addresseController {
	
	@GetMapping("/addresse")
	public String showAddresses(@ModelAttribute("addr") String myAddress,Model model) {
		Address addr = new Address();
		addr.setContent(myAddress);
		model.addAttribute("addr",addr);
		return "addresse";
	}
}
