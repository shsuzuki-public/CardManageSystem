package com.example.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.ClanM;
import com.example.demo.domain.DeckM;
import com.example.demo.repository.DeckRepository;
import com.example.demo.service.ClanService;
import com.example.demo.service.DeckService;

@Controller
public class DeckController {
	
	@Autowired
	ClanService clanService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String index(Model model){
		List<ClanM> clans = clanService.getData();
		model.addAttribute("clans",clans);
		return "html/top";
	}
	
	@Autowired
	DeckService deckService;
	
	@RequestMapping(value="/api/items", method=RequestMethod.GET)
	public String getItems(Model model) {
		
		List<DeckM> customers = deckService.getData();
		model.addAttribute("customers",customers);
		return "html/list";
	}
}
