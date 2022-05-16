package com.homoSapiens.bancoDeAnimes.foo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.homoSapiens.bancoDeAnimes.foo.controller.dto.AnimeDTO;
import com.homoSapiens.bancoDeAnimes.foo.model.Anime;
import com.homoSapiens.bancoDeAnimes.foo.service.AnimeService;

@RestController
@RequestMapping("/anime")
public class AnimeController {
	
	@Autowired
	AnimeService animeService;
	
	@GetMapping("/allanime")
	public List<AnimeDTO> listAll(){

		return animeService.getAnimes();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Anime> get(@PathVariable("id") int id) {
		Optional<Anime> anime = animeService.getAnimeById(id);
		return anime.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

}
