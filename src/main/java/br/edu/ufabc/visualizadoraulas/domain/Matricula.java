package br.edu.ufabc.visualizadoraulas.domain;

import lombok.Getter;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Getter
public class Matricula {
    @Id
    private UUID idMatricula;

    @Column(name = "RA")
    private String registroAcademico;

    @ManyToOne()
    @JoinColumn(name = "COD_TURMA")
    private Turmas codigoTurmas;
}
