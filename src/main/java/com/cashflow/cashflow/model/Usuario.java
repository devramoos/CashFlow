package com.cashflow.cashflow.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity
@Data
@Table(name = "cash_flow")
public abstract class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(min = 2, max = 50, message = "Nome deve ter entre 2 e 50 caracteres")
    @NotBlank
    private String name;

    @Email(message = "Email inválido")
    @NotBlank
    private String email;

    @NotBlank(message = "Senha não pode estar vazia")
    private String senha;

    @NotBlank(message = "Telefone não pode estar vazio")
    private String telefone;

    private Boolean situacao;

    private LocalDateTime dataCadastro;

    private LocalDateTime dataRegistro;
}
