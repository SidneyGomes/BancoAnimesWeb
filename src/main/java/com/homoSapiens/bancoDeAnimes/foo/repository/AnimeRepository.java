package com.homoSapiens.bancoDeAnimes.foo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.homoSapiens.bancoDeAnimes.foo.model.Anime;

@Repository
public interface AnimeRepository extends JpaRepository<Anime, Integer> {

}
