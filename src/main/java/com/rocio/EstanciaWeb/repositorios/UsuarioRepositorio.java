package com.rocio.EstanciaWeb.repositorios;

import com.rocio.EstanciaWeb.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Rocio
 */

@Repository
public interface UsuarioRepositorio extends JpaRepository<Usuario, String> {
    
}
