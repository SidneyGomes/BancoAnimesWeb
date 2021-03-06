package com.homoSapiens.bancoDeAnimes.foo.controller.dto;

import java.util.List;
import com.homoSapiens.bancoDeAnimes.foo.model.Anime;
import com.homoSapiens.bancoDeAnimes.foo.model.Episodio;
import lombok.Data;

@Data
public class AnimeDTO {

	private int id;
	private String name;
	private int tam;
	private String link;
	private int weekDay;
	private String image;
	private List<Episodio> episodios;

	public AnimeDTO(Anime anime) {
		this.id = anime.getId();
		this.name = anime.getName();
		this.link = anime.getLink();
		this.weekDay = anime.getWeekDay();
		this.image = anime.getImage();
		this.tam = anime.getTam();
		this.episodios = anime.getEpisodios();
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

	public int getTam() {
		return tam;
	}

	public void setTam(int tam) {
		this.tam = tam;
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

	public List<Episodio> getEpisodios() {
		return episodios;
	}

	public void setEpisodios(List<Episodio> episodios) {
		this.episodios = episodios;
	}

	
	
}
