package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;

public class GameMinDto {
	
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;

	public GameMinDto() {
		
	}

	public GameMinDto(Game Entity) {
		super();
		id = Entity.getId();
		title = Entity.getTitle();
		year = Entity.getYear();
		imgUrl = Entity.getImgUrl();
		shortDescription = Entity.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	
		

}
