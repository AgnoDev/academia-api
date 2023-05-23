package me.dio.academia.digital.controller;

import lombok.RequiredArgsConstructor;
import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.service.impl.AlunoServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/alunos")
@RequiredArgsConstructor
public class AlunoController {
    private final AlunoServiceImpl alunoService;

    @GetMapping
    private List<Aluno> getAll(@RequestParam(value = "dataDeNascimento", required = false) String dataDeNascimento){

        return alunoService.getAll(dataDeNascimento);
    }

    @PostMapping
    public Aluno create (@Valid @RequestBody AlunoForm alunoForm){
        return alunoService.create(alunoForm);
    }

    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacoesById(@PathVariable Long id) {
        return alunoService.getAllAvaliacoesById(id);

    }



}


