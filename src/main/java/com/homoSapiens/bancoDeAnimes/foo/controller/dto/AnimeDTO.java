package com.homoSapiens.bancoDeAnimes.foo.controller.dto;

import com.homoSapiens.bancoDeAnimes.foo.model.Anime;

public class AnimeDTO {

	private int id;
	private String name;
	private String link;
	private int weekDay;
	private String image;

	public AnimeDTO(Anime anime) {
		this.id = anime.getId();
		this.name = anime.getName();
		this.link = anime.getLink();
		this.weekDay = anime.getWeekDay();
		this.image = anime.getImage();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}

	public int getWeekDay() {
		return weekDay;
	}

	public void setWeekDay(int weekDay) {
		this.weekDay = weekDay;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
