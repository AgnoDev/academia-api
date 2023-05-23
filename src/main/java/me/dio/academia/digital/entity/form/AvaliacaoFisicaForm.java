package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import me.dio.academia.digital.entity.Aluno;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AvaliacaoFisicaForm {

  @Positive(message = "Id do Aluno deve ser maior que 0(zero).")
  private Long alunoId;

  @NotNull(message = "Preenchimento obrigatório.")
  @Positive(message = "O peso do Aluno deve ser maior que 0(zero).")
  private double peso;

  @NotNull(message = "Preenchimento obrigatório.")
  @Positive(message = "A altura do Aluno deve ser maior que 0(zero).")
  @DecimalMin(value = "150", message = "'${validatedValue}' precisa ser no mínimo {value}.")
  private double altura;
}
