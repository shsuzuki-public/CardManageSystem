package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.ClanM;
import com.example.demo.repository.ClanRepository;

@Service
public class ClanService {
	@Autowired
	ClanRepository clanRepository;

	public List<ClanM> getData(){
		return clanRepository.findAll();
	}
}
