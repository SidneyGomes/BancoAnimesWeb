package com.homoSapiens.bancoDeAnimes.foo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ForeignKey;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import com.sun.istack.NotNull;

@Entity
@Table(name = "Anime")
public class Anime {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "link")
	private String link;
	
	@Column(name = "weekday")
	private int weekDay;
	
	@Column(name = "image")
	private String image;

	public Anime(int id, String name, String link, int weekDay, String image, List<Episodio> episodios) {
		this.id = id;
		this.name = name;
		this.link = link;
		this.weekDay = weekDay;
		this.image = image;
		this.episodios = episodios;
	}

	public Anime(){}

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
	
	public List<Episodio> getEpisodios() {
		return episodios;
	}

	public void setEpisodios(List<Episodio> episodios) {
		this.episodios = episodios;
	}

	
	@NotNull()
	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "fk_episodio_id", foreignKey = @ForeignKey(name = "fk_episodio"), referencedColumnName = "id")
	private List<Episodio> episodios = new ArrayList<>();

}
