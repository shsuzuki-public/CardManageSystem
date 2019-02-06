package com.cardmanage.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.cardmanage.app.common.CardManageConfigReader;
import com.cardmanage.app.domain.ClanM;
import com.cardmanage.app.domain.DeckM;
import com.cardmanage.app.service.ClanService;
import com.cardmanage.app.service.DeckService;

@Controller
public class CardManageSystemController {
	
	//CardManageConfigReader config = new CardManageConfigReader();
	RestTemplate restTemplate = new RestTemplate();
	
	//public String apiUrl = config.getApiUrl();
	
	@Autowired
	ClanService clanService;
	
	@Autowired
	DeckService deckService;


	@SuppressWarnings("unchecked")
	@RequestMapping(value="/api/clans", method=RequestMethod.GET)
	public String index(Model model){
		//List<ClanM> clans = restTemplate.getForObject(apiUrl+"clans", List.class);
		List<ClanM> clans = restTemplate.getForObject("http://localhost:8090/clans", List.class);
		model.addAttribute("clans",clans);
		return "html/clanList";
	}
	
	@SuppressWarnings("unchecked")
	@RequestMapping(value="/api/decks", method=RequestMethod.GET)
	public String getItems(Model model) {
		//List<DeckM> decks = restTemplate.getForObject(apiUrl+"decks", List.class);
		List<DeckM> decks = restTemplate.getForObject("http://localhost:8090/decks", List.class);
		model.addAttribute("decks", decks);
		
		return "html/deckList";
	}

	@RequestMapping(value="/api/decks/{id}", method=RequestMethod.GET)
	public String getChooseDecks(Model model, @RequestParam("id") String id) {
		@SuppressWarnings("unchecked")
		String apiUrl = "http://localhost:8090/decks/{id}";
		DeckM decks = deckService.request(apiUrl,id);
		//List<DeckM> decks = restTemplate.getForObject(apiUrl, List.class);
		model.addAttribute("decks", decks);
		
		return "html/deckList";
	}
}
