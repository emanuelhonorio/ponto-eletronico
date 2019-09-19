package com.emanuelhonorio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emanuelhonorio.domain.Ponto;

public interface PontoRepository extends JpaRepository<Ponto, Integer> {

}
