package com.tsp.dspesquisa.repositories;

import com.tsp.dspesquisa.entites.Game;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * GameRepository
 */
public interface GameRepository extends JpaRepository<Game,Long> {

    
}