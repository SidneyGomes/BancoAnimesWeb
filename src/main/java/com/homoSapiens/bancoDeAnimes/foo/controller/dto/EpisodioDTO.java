package com.homoSapiens.bancoDeAnimes.foo.controller.dto;

import com.homoSapiens.bancoDeAnimes.foo.model.Episodio;
import lombok.Data;

@Data
public class EpisodioDTO {

	private int id;
	private String name;
	private boolean watched;

	public EpisodioDTO(Episodio episodio) {
		this.id = episodio.getId();
		this.name = episodio.getName();
		this.watched = episodio.isWatched();
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

	public boolean isWatched() {
		return watched;
	}

	public void setWatched(boolean watched) {
		this.watched = watched;
	}

}
