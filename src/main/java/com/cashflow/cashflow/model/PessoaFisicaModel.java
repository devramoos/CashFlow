package com.cashflow.cashflow.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.br.CPF;

@Setter
@Getter
@Entity
@DiscriminatorValue("PF") // Valor para diferenciar Pessoa Física na tabela de usuários
public class PessoaFisicaModel extends Usuario {

    @CPF
    @Column(unique = true, nullable = false, length = 11) // nullable = false para garantir que o CPF seja obrigatório
    @NotBlank(message = "CPF não pode estar vazio")
    private String cpf;

    public PessoaFisicaModel(String cpf) {
        this.cpf = cpf;

    }

    public PessoaFisicaModel() {
    }

}
