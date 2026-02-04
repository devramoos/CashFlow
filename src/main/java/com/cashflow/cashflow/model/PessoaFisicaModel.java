package com.cashflow.cashflow.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

@Entity
public class PessoaFisicaModel extends Usuario {


    @CPF
    @Column(unique = true)
    @NotBlank(message = "O nome é obrigatório")
    private String cpf;

    public PessoaFisicaModel(String cpf) {
        this.cpf = cpf;

    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
