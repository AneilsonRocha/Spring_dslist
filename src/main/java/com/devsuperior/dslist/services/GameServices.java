package com.devsuperior.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameMinDto;
import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.repositories.GameRepository;

@Service
public class GameServices {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDto> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(GameMinDto::new).toList();
	}
	

}
