package com.haroldo.crudspring.controllers;

import java.util.List;

import com.haroldo.crudspring.models.TrilhaHistorico;
import com.haroldo.crudspring.repositories.TrilhaHistoricoRepository;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/trilha")
@AllArgsConstructor
public class TrilhaHistoricoController {

    private final TrilhaHistoricoRepository trilhaHistoricoRepository;

    @GetMapping
    public List<TrilhaHistorico> list() {
        return trilhaHistoricoRepository.findAll();
    }
    
}
