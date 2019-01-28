package com.cardmanage.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cardmanage.app.domain.DeckM;
import com.cardmanage.app.repository.DeckRepository;

@Service
public class DeckService {
	@Autowired
	DeckRepository deckRepository;

	public List<DeckM> getData(){
		return deckRepository.findAll();
	}
}
