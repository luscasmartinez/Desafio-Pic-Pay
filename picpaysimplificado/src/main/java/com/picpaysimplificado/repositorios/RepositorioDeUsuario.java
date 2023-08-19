package com.picpaysimplificado.repositorios;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.picpaysimplificado.dominio.usuario.Usuario;
import java.util.List;


public interface RepositorioDeUsuario extends JpaRepository <Usuario, Long> {
    
    Optional <Usuario> findByCpf(String cpf);
    Optional <Usuario> findById(long id);
}
