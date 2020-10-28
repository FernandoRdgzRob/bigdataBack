package com.grokonez.jwtauthentication.controller;

import com.grokonez.jwtauthentication.model.Estado;
import com.grokonez.jwtauthentication.repository.EstadoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import javax.validation.Valid;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class EstadoController {

    @Autowired
    private EstadoRepository estadoRepository;

    @GetMapping("/estados")
    public List<Estado> getEstados() {
        return estadoRepository.findAll();
    }
  
    
}