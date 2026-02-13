package com.cashflow.cashflow.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@Table(name = "usuario_info")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) // Estratégia de herança para armazenar diferentes tipos de usuários na mesma tabela
@DiscriminatorColumn(name = "tipo_usuario") // Coluna para diferenciar os tipos de usuário
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

    public Usuario(Long id, String name, String email, String senha, String telefone, Boolean situacao, LocalDateTime dataCadastro, LocalDateTime dataRegistro) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.senha = senha;
        this.telefone = telefone;
        this.situacao = situacao;
        this.dataCadastro = dataCadastro;
        this.dataRegistro = dataRegistro;
    }

    public Usuario() {
    }

}
