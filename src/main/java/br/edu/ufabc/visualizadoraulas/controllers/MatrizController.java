package br.edu.ufabc.visualizadoraulas.controllers;

import br.edu.ufabc.visualizadoraulas.domain.Turmas;
import br.edu.ufabc.visualizadoraulas.services.MatrizService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/alunos")
@RequiredArgsConstructor
public class MatrizController {
    private final MatrizService matrizService;

    @GetMapping("/{ra}")
    public ResponseEntity<List<Turmas> > obterMatriz(@PathVariable("ra") String registroAcademico) {
        List<Turmas> turmas = matrizService.obterMatriz(registroAcademico);

        return ResponseEntity.ok(turmas);
    }
}