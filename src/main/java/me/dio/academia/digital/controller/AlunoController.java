package me.dio.academia.digital.controller;

import lombok.RequiredArgsConstructor;
import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@RequestMapping("/alunos")
@RequiredArgsConstructor
public class AlunoController {
    private final AlunoServiceImpl alunoService;

    @GetMapping
    private List<Aluno> getAll(){
        return alunoService.getAll();
    }

}


