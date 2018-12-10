package com.example.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.example.demo.domain.ClanM;
import com.example.demo.domain.DeckM;
import com.example.demo.service.ClanService;
import com.example.demo.service.DeckService;

@Controller
public class DeckController {
	
	RestTemplate restTemplate = new RestTemplate();
	
	@Autowired
	ClanService clanService;
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/api/clans", method=RequestMethod.GET)
	public String index(Model model){
		List<ClanM> clans = restTemplate.getForObject("http://localhost:8090/clans", List.class);
		model.addAttribute("clans",clans);
		return "html/top";
	}
	
	@Autowired
	DeckService deckService;
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/api/decks", method=RequestMethod.GET)
	public String getItems(Model model) {
		//RestTemplate restTemplate = new RestTemplate();
		List<DeckM> decks = restTemplate.getForObject("http://localhost:8090/decks", List.class);
		model.addAttribute("decks", decks);
		
		return "html/list";
		/*
		List<DeckM> customers = deckService.getData();
		model.addAttribute("customers",customers);
		return "html/list";
		*/
	}
}
