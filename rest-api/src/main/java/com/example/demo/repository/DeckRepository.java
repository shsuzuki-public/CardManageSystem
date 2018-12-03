package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.DeckM;

@Repository
public interface DeckRepository extends JpaRepository<DeckM,Integer> {
		
}
