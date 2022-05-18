package com.homoSapiens.bancoDeAnimes.foo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Episodio")
public class Episodio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "watched")
	private boolean watched;

	
	public Episodio() {}
	
	public Episodio(int id, String name, boolean watched) {
		super();
		this.id = id;
		this.name = name;
		this.watched = watched;
	}
	
	public Episodio(String name, boolean watched) {
		this.name = name;
		this.watched = watched;
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

	public void setWatched(boolean watcher) {
		this.watched = watcher;
	}
	
	
}	
