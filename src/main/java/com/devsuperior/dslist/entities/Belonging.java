package com.devsuperior.dslist.entities;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belonging {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EmbeddedId
	private BelongingPK id = new BelongingPK();
	
	private Integer position;

	public Belonging() {
		 
	}

	public Belonging(Game game,GameList list, Integer position) {
		id.setGame(game);
		id.setList(list);
		this.position = position;
	}
	
	
	
	

}
