package com.fatec.p2simulado.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.fatec.p2simulado.entities.Anuncio;
import com.fatec.p2simulado.services.AnuncioServices;

@RestController
@RequestMapping("anuncios")
@CrossOrigin
public class AnuncioController {
    
    @Autowired
    private AnuncioServices anuncioService;

    @PostMapping
    public ResponseEntity<Anuncio> saveAnuncio(@RequestBody Anuncio anuncio){
        Anuncio anuncioSalvo = anuncioService.save(anuncio);
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(anuncio.getId())
                .toUri();

        return ResponseEntity.created(location).body(anuncioSalvo);
    }
}
