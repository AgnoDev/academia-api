package me.dio.academia.digital.entity.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlunoForm {

  @NotBlank(message = "Preenchimento obrigatório.")
  @Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
  private String nome;

  @NotBlank(message = "Preenchimento obrigatório.")
  @CPF(message = "'${validatedValue}' é inválido.")
  private String cpf;

  @NotBlank(message = "Preenchimento obrigatório.")
  @Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres.")
  private String bairro;

  @NotNull(message = "Preenchimento obrigatório.")
  @Past(message = "Data '${validatedValue}' é inválida.")
  private LocalDate dataDeNascimento;
}
