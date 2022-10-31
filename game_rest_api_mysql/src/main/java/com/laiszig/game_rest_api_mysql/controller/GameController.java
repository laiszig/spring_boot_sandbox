package com.laiszig.game_rest_api_mysql.controller;

import com.laiszig.game_rest_api_mysql.entity.Game;
import com.laiszig.game_rest_api_mysql.service.GameService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/games")
public class GameController {

    private GameService gameService;

    public GameController(GameService gameService) {
        super();
        this.gameService = gameService;
    }

    @PostMapping
    public ResponseEntity<Game> saveGame(@RequestBody Game game){
        return new ResponseEntity<>(gameService.saveGame(game), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Game> findGames(){
        return gameService.getAllGames();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Game> findGame(@PathVariable("id") Long id){
        return new ResponseEntity<>(gameService.getGameById(id), HttpStatus.OK);
    }
}

/*
@RestController is an annotation that combines @Controller and @ResponseBody, which eliminates the need
to annotate every request handling method of the controller class with the @ResponseBody annotation
 */