package com.emanuelhonorio.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.emanuelhonorio.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {

}
