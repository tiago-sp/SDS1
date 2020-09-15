package com.tsp.dspesquisa.repositories;


import com.tsp.dspesquisa.entites.Genre;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * GenreRepository
 */
public interface GenreRepository extends JpaRepository<Genre,Long> {

    
}