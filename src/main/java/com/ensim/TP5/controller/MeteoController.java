package com.ensim.TP5.controller;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.ensim.TP5.model.Feature;
import com.ensim.TP5.model.Features;
import com.ensim.TP5.model.Properties;


@Controller
public class MeteoController {

	@RequestMapping(value = "/meteo", method = RequestMethod.POST)
	public String showMeteo(@RequestParam("input_addr") String myAddress, Model model) {
		model.addAttribute("myAddress", myAddress);

		RestTemplate restTemplate = new RestTemplate();
		
		//Showing the body of the request
		String fooResourceUrl = "https://api-adresse.data.gouv.fr/search/?q=";
		ResponseEntity<String> response = restTemplate.getForEntity(fooResourceUrl + myAddress, String.class);
		String body = response.getBody();
		model.addAttribute("body", body);
		
		Features collection = restTemplate.getForObject(fooResourceUrl + myAddress, Features.class);
		ArrayList<Feature> features= collection.getFeatures();

		
		ArrayList<Properties> properties = new ArrayList<Properties>();
		for(Feature f : features){
			properties.add(f.getProperties());
		}
		
		int count = properties.size();
		model.addAttribute("count",count);
		
		model.addAttribute("properties",properties);
		
		return "meteo";
	}
}
