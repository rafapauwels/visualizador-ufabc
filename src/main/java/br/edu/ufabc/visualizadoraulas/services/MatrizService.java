package br.edu.ufabc.visualizadoraulas.services;

import br.edu.ufabc.visualizadoraulas.domain.Matricula;
import br.edu.ufabc.visualizadoraulas.domain.Turmas;
import br.edu.ufabc.visualizadoraulas.repository.MatriculaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class MatrizService {
    private final MatriculaRepository repository;

    public List<Turmas> obterMatriz(String registroAcademico) {
        List<Matricula> matriculas = repository.findByRegistroAcademico(registroAcademico);
        return matriculas.stream().map(Matricula::getCodigoTurmas).collect(Collectors.toList());
    }
}
