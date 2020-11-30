package io.github.rhyanspisoni.gerencia.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Usuario{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column(unique = true, name = "login")
    private String nome;

    @Column(name = "senha")
    private String senha;
}
