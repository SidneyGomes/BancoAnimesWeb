package com.homoSapiens.bancoDeAnimes.foo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.homoSapiens.bancoDeAnimes.foo.controller.dto.AnimeDTO;
import com.homoSapiens.bancoDeAnimes.foo.service.AnimeService;

@RestController
@RequestMapping("/anime")
public class AnimeController {
	
	@Autowired
	AnimeService animeService;
	
	@GetMapping("/")
	public List<AnimeDTO> listAll(){

		return animeService.getAnimes();
	}
	

}
