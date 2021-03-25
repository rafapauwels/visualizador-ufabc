package br.edu.ufabc.visualizadoraulas.repository;

import br.edu.ufabc.visualizadoraulas.domain.Matricula;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MatriculaRepository extends CrudRepository<Matricula, String> {
    List<Matricula> findByRegistroAcademico(String registroAcademico);
}
