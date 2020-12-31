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

import com.ensim.TP5.model.Coordinates;
import com.ensim.TP5.model.Feature;
import com.ensim.TP5.model.Features;
import com.ensim.TP5.model.Geometry;
import com.ensim.TP5.model.Properties;


@Controller
public class MeteoController {

	@RequestMapping(value = "/meteo", method = RequestMethod.POST)
	public String showMeteo(@RequestParam("input_addr") String myAddress, Model model) {
		model.addAttribute("myAddress", myAddress);

		RestTemplate restTemplate = new RestTemplate();
		
		//Showing the body of the request
		String ResourceUrl = "https://api-adresse.data.gouv.fr/search/?q=";
		ResponseEntity<String> response = restTemplate.getForEntity(ResourceUrl + myAddress, String.class);
		String body = response.getBody();
		model.addAttribute("body", body);
		
		Features collection = restTemplate.getForObject(ResourceUrl + myAddress, Features.class);
		ArrayList<Feature> features= collection.getFeatures();
		
		
		
		
		
		
		
		ArrayList<Geometry> geometry = new ArrayList<Geometry>();
		for(Feature f : features){
			geometry.add(f.getGeometry());
			
		}
		
		int count = geometry.size();
		model.addAttribute("count",count);
		
		model.addAttribute("geometry",geometry);
		
		
		//API OpenWeather MAP
		
		
		String key = "75fc5ee8b7b1b66ca7a543164c52d70d";
		
		String Url = "http://api.openweathermap.org/data/2.5/weather?";
		
		//ResponseEntity<String> weather = restTemplate.getForEntity(Url +"lat="+X+"&lon="+Y+"&appid="+key, String.class);
		//String retour = weather.getBody();
		
		//model.addAttribute("weather",retour);
		
		
		return "meteo";
	}
}
