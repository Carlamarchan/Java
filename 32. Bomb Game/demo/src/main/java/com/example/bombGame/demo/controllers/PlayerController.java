package com.example.bombGame.demo.controllers;

import com.example.bombGame.demo.entities.Player;
import com.example.bombGame.demo.services.PlayerService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})
@RestController
@RequestMapping("/players")
public class PlayerController {
    @Autowired
    private PlayerService playerService;
    @GetMapping
    public List<Player> playerList(){
        return playerService.findPlayers();
    }
    @PostMapping
    public Player registerNewPlayer(@RequestBody @Valid Player playerJSON) {
        return playerService.savePlayer(playerJSON);
    }
}
