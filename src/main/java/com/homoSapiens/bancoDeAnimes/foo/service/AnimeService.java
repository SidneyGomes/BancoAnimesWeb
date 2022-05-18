package com.homoSapiens.bancoDeAnimes.foo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.homoSapiens.bancoDeAnimes.foo.controller.dto.AnimeDTO;
import com.homoSapiens.bancoDeAnimes.foo.model.Anime;
import com.homoSapiens.bancoDeAnimes.foo.repository.AnimeRepository;

@Service
public class AnimeService {
	
	@Autowired
	AnimeRepository animeRepository;
	
	public List<AnimeDTO> getAnimes(){
		return animeRepository.findAll().stream().map(AnimeDTO::new).collect(Collectors.toList());
	}
	
	public Optional<Anime> getAnimeById(int id){
		return animeRepository.findById(id);
	}
	
	public Anime cadastrar(Anime aluno) {
		return animeRepository.save(aluno);
	}
	
}
