package com.cashflow.cashflow.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "registro_financeiro")
public class RegistroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Seu registro deve conter descrição.")
    private String descricao;

    @NotBlank(message = "Seu registro deve conter categoria.")
    private String categoria;

    @NotBlank(message = "Seu registro deve conter subcategoria.")
    private String subcategoria;

    @Digits(integer = 10, fraction = 2, message = "Valor deve ser um número com até 10 dígitos inteiros e 2 decimais.")
    @NotNull(message = "Seu registro deve conter um valor.")
    @DecimalMin(value = "0.01", message = "Seu registro deve ser maior que 0.01")
    private BigDecimal valor;

    @NotNull(message = "Seu registro deve conter uma data prevista.")
    @FutureOrPresent
    private LocalDate dataPrevista;

    @ManyToOne
    @JoinColumn(name = "pessoa_id")
    private Usuario pessoa;

    public RegistroModel(Long id, String descricao, String categoria, String subcategoria, BigDecimal valor, LocalDate dataPrevista, Usuario pessoa) {
        this.id = id;
        this.descricao = descricao;
        this.categoria = categoria;
        this.subcategoria = subcategoria;
        this.valor = valor;
        this.dataPrevista = dataPrevista;
        this.pessoa = pessoa;
    }

    public RegistroModel() {
    }
}
