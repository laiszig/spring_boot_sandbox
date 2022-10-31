package com.laiszig.game_rest_api_mysql.service.impl;

import com.laiszig.game_rest_api_mysql.entity.Game;
import com.laiszig.game_rest_api_mysql.exception.ResourceNotFoundException;
import com.laiszig.game_rest_api_mysql.repository.GameRepository;
import com.laiszig.game_rest_api_mysql.service.GameService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameServiceImpl implements GameService {

    private GameRepository gameRepository;

    public GameServiceImpl(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    @Override
    public Game saveGame(Game game) {
        return gameRepository.save(game);
    }

    @Override
    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }

    @Override
    public Game getGameById(Long id) {
//        Optional<Game> game = gameRepository.findById(id);
//        if(game.isPresent()) {
//            return game.get();
//        } else {
//            throw new ResourceNotFoundException("Game", "Id", id);
//        }
        return gameRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Game", "Id", id));
    }
}

/*
1. Setter-based dependency injection: whenever we have optional parameters
2. Constructor-based dependency injection: whenever we have mandatory parameters

Since Spring 4.3, if a class, which is configured as a Spring bean, has only one constructor,
the @Autowired annotation can me omitted and Spring will use that constructor and inject all necessary dependencies
 */


