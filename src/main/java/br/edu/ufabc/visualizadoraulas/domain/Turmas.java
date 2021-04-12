package br.edu.ufabc.visualizadoraulas.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
public class Turmas {
    @Id
    @JsonProperty("codigo_turma")
    @Column(name = "COD_TURMA")
    private String codigoTurma;

    @Column(name = "TURMA")
    private String turma;

    @Column(name = "NOME_MATERIA")
    private String nomeMateria;

    @Column(name = "DIA1")
    private String dia1;

    @Column(name = "HORARIO1")
    private String horario1;

    @Column(name = "ROTACAO1")
    private String rotacao1;

    @Column(name = "DIA2")
    private String dia2;

    @Column(name = "HORARIO2")
    private String horario2;

    @Column(name = "ROTACAO2")
    private String rotacao2;

    @Column(name = "DIA3")
    private String dia3;

    @Column(name = "HORARIO3")
    private String horario3;

    @Column(name = "ROTACAO3")
    private String rotacao3;

    @Column(name = "DIA4")
    private String dia4;

    @Column(name = "HORARIO4")
    private String horario4;

    @Column(name = "ROTACAO4")
    private String rotacao4;

    @JsonProperty("DOCENTE_TEORIA")
    private String docenteTeoria;

    @JsonProperty("DOCENTE_PRATICA")
    private String docentePratica;
}
