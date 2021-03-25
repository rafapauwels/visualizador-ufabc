package br.edu.ufabc.visualizadoraulas.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Aluno {
    @Id
    private String email;
    private String senha;
    private String salt;
    private String ra;
}
