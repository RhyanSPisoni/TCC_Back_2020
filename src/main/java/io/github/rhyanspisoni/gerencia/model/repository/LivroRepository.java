package io.github.rhyanspisoni.gerencia.model.repository;

import io.github.rhyanspisoni.gerencia.model.entity.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepository extends JpaRepository<Livro, Integer> {
}
