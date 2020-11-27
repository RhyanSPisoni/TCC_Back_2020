package io.github.rhyanspisoni.gerencia.model.entity;

import com.sun.javafx.beans.IDProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter@Setter
@NoArgsConstructor
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;
    @Column
    private String NOME;
    @Column
    private String AUTOR;
    @Column
    private String GENERO;
    @Column
    private String CLASSIFICACAO;
    @Column
    private int PRECOCOMP;
    @Column
    private int PRECOALUG;
}
