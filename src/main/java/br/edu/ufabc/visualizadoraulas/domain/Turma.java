package br.edu.ufabc.visualizadoraulas.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Getter
public class Turma {
    @Id
    @JsonProperty("codigo_turma")
    private String codigoTurma;
    private String turma;
    private String horarios;
    private String turno;
    private String tpi;
    @JsonProperty("docente_teoria")
    private String docenteTeoria;
    @JsonProperty("docente_pratica")
    private String docentePratica;
}
