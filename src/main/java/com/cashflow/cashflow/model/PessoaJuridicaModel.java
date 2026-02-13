package com.cashflow.cashflow.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CNPJ;

@Entity
@DiscriminatorValue("PJ") // Valor para diferenciar Pessoa Jurídica na tabela de usuários
public class PessoaJuridicaModel extends Usuario {

    @CNPJ
    @Column(unique = true, nullable = false, length = 14) // nullable = false para garantir que o CNPJ seja obrigatório
    @NotBlank(message = "CNPJ não pode estar vazio")
    private String cnpj;

    public PessoaJuridicaModel() {
    }

    public PessoaJuridicaModel(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
