package com.example.bombGame.demo.services;

import com.example.bombGame.demo.entities.Player;
import com.example.bombGame.demo.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerService {
    @Autowired
    private PlayerRepository playerRepository;

    //Consultar los jugadores
    public List<Player> findPlayers(){
        return (List<Player>) playerRepository.findAll();
    }

    //Guardar uno
    public Player savePlayer(Player newPlayer) {
        return playerRepository.save(newPlayer);
    }
}
