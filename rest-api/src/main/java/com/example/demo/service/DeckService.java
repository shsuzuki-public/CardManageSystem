package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.DeckM;
import com.example.demo.repository.DeckRepository;

@Service
public class DeckService {
	@Autowired
	DeckRepository deckRepository;

	public List<DeckM> getData(){
		return deckRepository.findAll();
	}
}
