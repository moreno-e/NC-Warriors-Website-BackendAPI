package com.warriorsapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.warriorsapi.dao.PlayerRepository;
import com.warriorsapi.model.Player;


@RestController
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
@RequestMapping("/players")
public class PlayerController {

	@Autowired
	private PlayerRepository playerJpaRepository;
	
	@GetMapping("/team/{team}")
	public List<Player> getTeam(@PathVariable String team){
		return playerJpaRepository.findPlayersByTeam(team);
		
	}
	

}
