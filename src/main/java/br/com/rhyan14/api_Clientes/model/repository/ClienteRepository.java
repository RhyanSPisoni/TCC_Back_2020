package br.com.rhyan14.api_Clientes.model.repository;

import br.com.rhyan14.api_Clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
