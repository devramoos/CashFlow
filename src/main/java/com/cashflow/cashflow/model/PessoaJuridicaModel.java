package com.cashflow.cashflow.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.br.CNPJ;

@Entity
public class PessoaJuridicaModel extends Usuario {

    @CNPJ
    @Column(unique = true)
    @NotBlank
    private String cnpj;

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
