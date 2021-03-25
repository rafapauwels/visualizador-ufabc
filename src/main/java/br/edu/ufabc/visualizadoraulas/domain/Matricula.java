package br.edu.ufabc.visualizadoraulas.domain;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Matricula {
    @Id
    private int idMatricula;
    private String registroAcademico;
    @ManyToOne()
    private Turma codigoTurma;
}
