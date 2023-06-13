package com.fatec.p2simulado.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.p2simulado.entities.Anuncio;
import com.fatec.p2simulado.repositories.AnuncioRepository;

@Service
public class AnuncioServices {
    
    @Autowired
    private AnuncioRepository anuncioRepository;


    public List<Anuncio> getAnuncios(){
        return anuncioRepository.findAll();
    }

    public Anuncio save(Anuncio anuncio){
        return anuncioRepository.save(anuncio);
    }

}
