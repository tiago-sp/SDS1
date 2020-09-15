package com.tsp.dspesquisa.repositories;

import com.tsp.dspesquisa.entites.Record;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * GameRepository
 */
@Repository
public interface RecordRepository extends JpaRepository<Record,Long> {

    
}