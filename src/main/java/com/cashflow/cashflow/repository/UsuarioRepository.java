package com.cashflow.cashflow.repository;

import com.cashflow.cashflow.model.RegistroModel;
import com.cashflow.cashflow.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
