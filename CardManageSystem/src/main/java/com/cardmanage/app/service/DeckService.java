package com.cardmanage.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.cardmanage.app.domain.DeckM;
import com.cardmanage.app.repository.DeckRepository;

@Service
public class DeckService {
	RestTemplate restTemplate = new RestTemplate();

	@Autowired
	DeckRepository deckRepository;

	public List<DeckM> getData(){
		return deckRepository.findAll();
	}

	public DeckM request(String url, String id){
		
		return restTemplate.getForObject(url, DeckM.class, id);
	}
}
