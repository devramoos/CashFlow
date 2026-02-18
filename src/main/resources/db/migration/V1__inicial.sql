CREATE TABLE usuario_info (
                              id bigint NOT NULL AUTO_INCREMENT,
                              tipo_usuario varchar(31) NOT NULL,
                              name varchar(50) NOT NULL,
                              email varchar(255) NOT NULL,
                              senha varchar(255) NOT NULL,
                              telefone varchar(255) NOT NULL,
                              situacao bit(1) DEFAULT NULL,
                              data_cadastro datetime(6) DEFAULT NULL,
                              data_registro datetime(6) DEFAULT NULL,

    -- CORREÇÃO: Removemos o NOT NULL daqui para permitir Herança
                              cpf varchar(11) DEFAULT NULL,
                              cnpj varchar(14) DEFAULT NULL,

                              PRIMARY KEY (id),
                              UNIQUE KEY uk_cpf (cpf),
                              UNIQUE KEY uk_cnpj (cnpj)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


CREATE TABLE registro_financeiro (
                                     id bigint NOT NULL AUTO_INCREMENT,
                                     descricao varchar(255) NOT NULL,
                                     categoria varchar(255) NOT NULL,
                                     subcategoria varchar(255) NOT NULL,
                                     valor decimal(12, 2) NOT NULL,
                                     data_prevista date NOT NULL,
                                     pessoa_id bigint DEFAULT NULL,

                                     PRIMARY KEY (id),
                                     KEY fk_registro_pessoa (pessoa_id),
                                     CONSTRAINT fk_registro_pessoa FOREIGN KEY (pessoa_id) REFERENCES usuario_info (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;