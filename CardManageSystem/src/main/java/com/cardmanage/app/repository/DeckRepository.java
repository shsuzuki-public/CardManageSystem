package com.cardmanage.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cardmanage.app.domain.DeckM;

@Repository
public interface DeckRepository extends JpaRepository<DeckM,Integer> {
		
}
