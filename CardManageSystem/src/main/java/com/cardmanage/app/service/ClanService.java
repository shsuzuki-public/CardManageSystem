package com.cardmanage.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cardmanage.app.domain.ClanM;
import com.cardmanage.app.repository.ClanRepository;

@Service
public class ClanService {
	@Autowired
	ClanRepository clanRepository;

	public List<ClanM> getData(){
		return clanRepository.findAll();
	}
}
