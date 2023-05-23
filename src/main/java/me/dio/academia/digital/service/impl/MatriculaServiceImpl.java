package me.dio.academia.digital.service.impl;

import lombok.RequiredArgsConstructor;
import me.dio.academia.digital.entity.Matricula;
import me.dio.academia.digital.entity.form.MatriculaForm;
import me.dio.academia.digital.repository.MatriculaRepository;
import me.dio.academia.digital.service.IMatriculaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MatriculaServiceImpl implements IMatriculaService {
    private final MatriculaRepository matriculaRepository;
    @Override
    public Matricula create(MatriculaForm form) {
        return null;
    }

    @Override
    public Matricula get(Long id) {
        return null;
    }

    @Override
    public List<Matricula> getAll() {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
