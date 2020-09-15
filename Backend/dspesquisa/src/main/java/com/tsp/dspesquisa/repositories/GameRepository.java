package com.tsp.dspesquisa.repositories;

import com.tsp.dspesquisa.entites.Game;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * GameRepository
 */
@Repository
public interface GameRepository extends JpaRepository<Game,Long> {

    
}