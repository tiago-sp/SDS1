package com.tsp.dspesquisa.resources;

import java.util.List;

import com.tsp.dspesquisa.dto.GameDTO;
import com.tsp.dspesquisa.repositories.GameRepository;
import com.tsp.dspesquisa.services.GameService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * GameResource
 */
@RestController
@RequestMapping(value = "/games")
public class GameResource {

    @Autowired
    private GameService service;

    @GetMapping
    public ResponseEntity<List<GameDTO>> findAll(){
        List<GameDTO> list = service.findAll();
        return ResponseEntity.ok().body(list);
    } 

}