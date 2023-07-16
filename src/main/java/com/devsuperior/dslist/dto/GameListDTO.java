package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.GameList;

public class GameListDTO {
	
	private Long id;
	private String nome;
	
	public GameListDTO() {
		
	}
	public GameListDTO(GameList entity) {
		id= entity.getId();
		nome= entity.getNome();
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
	

}
