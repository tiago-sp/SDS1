package com.tsp.dspesquisa.repositories;

import com.tsp.dspesquisa.entites.Record;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * GameRepository
 */
public interface RecordRepository extends JpaRepository<Record,Long> {

    
}