package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MatriculaForm {

  @NotNull(message = "Preenchimento obrigatório.")
  @Positive(message = "Id do Aluno deve ser maior que 0(zero).")
  private Long alunoId;

}
