package io.github.rhyanspisoni.gerencia.model.entity;

import com.sun.xml.bind.v2.model.core.ID;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter@Setter
@NoArgsConstructor
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @Column
    private String NOME;
    @Column
    private String EMAIL;
    @Column
    private String SENHA;
    @Column
    private int CARTEIRA;
    @Column
    private int COMPRAS;
}
