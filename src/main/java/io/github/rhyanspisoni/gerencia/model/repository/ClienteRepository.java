package io.github.rhyanspisoni.gerencia.model.repository;

import io.github.rhyanspisoni.gerencia.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
