package com.tsp.dspesquisa.services;

import java.time.Instant;

import com.tsp.dspesquisa.dto.RecordDTO;
import com.tsp.dspesquisa.dto.RecordInsertDTO;
import com.tsp.dspesquisa.entites.Game;
import com.tsp.dspesquisa.entites.Record;
import com.tsp.dspesquisa.repositories.GameRepository;
import com.tsp.dspesquisa.repositories.RecordRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * GameService
 */
@Service
public class RecordService {

    @Autowired
    private RecordRepository repository;

    @Autowired
    private GameRepository gamerepository;

    @Transactional
    public RecordDTO insert(RecordInsertDTO dto){
        Record entity = new Record();
        entity.setName(dto.getName());
        entity.setAge(dto.getAge());
        entity.setMoment(Instant.now());

        Game game = gamerepository.getOne(dto.getGameId());
        entity.setGame(game);

        entity = repository.save(entity);
        return new RecordDTO(entity);
    } 
    
}