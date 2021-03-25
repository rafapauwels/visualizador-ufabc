package br.edu.ufabc.visualizadoraulas.services;

import br.edu.ufabc.visualizadoraulas.domain.Matricula;
import br.edu.ufabc.visualizadoraulas.domain.Turma;
import br.edu.ufabc.visualizadoraulas.repository.MatriculaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class MatrizService {
    private final MatriculaRepository repository;

    public List<Turma> obterMatriz(String registroAcademico) {
        List<Matricula> matriculas = repository.findByRegistroAcademico(registroAcademico);
        return matriculas.stream().map(Matricula::getCodigoTurma).collect(Collectors.toList());
    }
}
