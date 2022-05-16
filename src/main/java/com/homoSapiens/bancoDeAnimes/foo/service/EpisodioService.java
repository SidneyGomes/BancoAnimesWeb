package com.homoSapiens.bancoDeAnimes.foo.service;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.homoSapiens.bancoDeAnimes.foo.controller.dto.EpisodioDTO;
import com.homoSapiens.bancoDeAnimes.foo.repository.EpisodioRepository;

@Service
public class EpisodioService {
	
	@Autowired
	EpisodioRepository episodioRepository;
	
	public List<EpisodioDTO> getEpisodios(){
		return episodioRepository.findAll().stream().map(EpisodioDTO::new).collect(Collectors.toList());
	}
	
	
	/*
	public List<EpisodioDTO> getEpisodioByAnimeId(int id){
		return null;
		
	}
	*/
}
