package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.domain.ClanM;

@Repository
public interface ClanRepository extends JpaRepository<ClanM,Integer>{

}
