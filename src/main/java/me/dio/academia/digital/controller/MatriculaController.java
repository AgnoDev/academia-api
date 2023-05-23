package me.dio.academia.digital.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.form.MatriculaForm;
import me.dio.academia.digital.service.impl.MatriculaServiceImpl;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/matriculas")
@RequiredArgsConstructor
public class MatriculaController {
    private final MatriculaServiceImpl matriculaService;

    @PostMapping
    public Matricula create(@Valid @RequestBody MatriculaForm matriculaForm){
        return matriculaService.create(matriculaForm);
    }

    @GetMapping
    public List<Matricula> getAllMatriculas(){
        return matriculaService.getAll();
    }

    @GetMapping("/buscaselecionada")
    public List<Matricula> getAllMatriculasBairro(@RequestParam(value = "bairro", required = false) String bairro){
        return matriculaService.getAllMatriculasBairro(bairro);
    }

}
