package com.fatec.p2simulado.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.p2simulado.entities.Anuncio;

public interface AnuncioRepository extends JpaRepository <Anuncio, Integer>{
    
}
