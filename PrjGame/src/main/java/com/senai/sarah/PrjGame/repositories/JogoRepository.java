package com.senai.sarah.PrjGame.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.sarah.PrjGame.entities.Jogo;

public interface JogoRepository extends JpaRepository<Jogo, Long>{
	
}
