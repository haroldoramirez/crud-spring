package com.haroldo.crudspring.repositories;

import com.haroldo.crudspring.models.TrilhaHistorico;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrilhaHistoricoRepository extends JpaRepository<TrilhaHistorico, Long> { 
    
}
