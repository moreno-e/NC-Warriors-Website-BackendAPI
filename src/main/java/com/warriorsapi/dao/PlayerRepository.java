package com.warriorsapi.dao;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.warriorsapi.model.Player;

@Repository
@CrossOrigin(origins = "http://localhost:3000", allowCredentials = "true")
public interface PlayerRepository extends JpaRepository<Player, Integer> {

	Player findByUsername(String username);
	
	List<Player> findByTeam(String team);
	
	@Query("select players from Player players where players.team=:team ")
	List<Player> findPlayersByTeam(@Param("team") String team);
	
}