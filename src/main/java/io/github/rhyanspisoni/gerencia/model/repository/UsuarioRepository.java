package io.github.rhyanspisoni.gerencia.model.repository;

import io.github.rhyanspisoni.gerencia.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByNome(String nome);
}
