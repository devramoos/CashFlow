package com.cashflow.cashflow.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

import java.time.LocalDate;


@Entity
@Table(name = "ResgistroFinanceiro")
public class ResgistroModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "Seu registro deve conter descrição.")
    private String descricao;

    @NotBlank(message = "Seu registro deve conter categoria.")
    private String categoria;

    @NotBlank(message = "Seu registro deve conter categoria.")
    private String subcategoria;

    @NotBlank(message = "O valor é obrigatório")
    @DecimalMin(value = "0.01", message = "Seu registro deve ser maior que 0.01")
    private double valor;

    @NotBlank(message = "Seu registro deve conter a data prevista do pagamento.")
    @FutureOrPresent
    private LocalDate dataPrevista;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario pessoa;

}
