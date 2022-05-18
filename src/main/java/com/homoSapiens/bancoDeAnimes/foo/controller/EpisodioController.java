package com.homoSapiens.bancoDeAnimes.foo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.homoSapiens.bancoDeAnimes.foo.controller.dto.EpisodioDTO;
import com.homoSapiens.bancoDeAnimes.foo.service.EpisodioService;

@RestController
@RequestMapping("/episodio")
public class EpisodioController {
	
	@Autowired
	EpisodioService episodioService;
	
	@GetMapping("/allepisodio")
	public List<EpisodioDTO> listAll(){
		return episodioService.getEpisodios();
	}
	
	
	
}
