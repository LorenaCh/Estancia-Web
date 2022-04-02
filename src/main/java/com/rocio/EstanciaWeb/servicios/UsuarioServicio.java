package com.rocio.EstanciaWeb.servicios;

import com.rocio.EstanciaWeb.entidades.Usuario;
import com.rocio.EstanciaWeb.repositorios.UsuarioRepositorio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UsuarioServicio {
    
    @Autowired
    private UsuarioRepositorio usuarioRepositorio;
    
    @Transactional
    public void guardar(Usuario usuario){
        usuarioRepositorio.save(usuario);
    }
    
    @Transactional
    public void eliminar(Usuario usuario){
        if(buscarPorId(usuario) != null)
            usuarioRepositorio.delete(usuario);
    }
    
    @Transactional(readOnly = true)
    public Usuario buscarPorId(Usuario usuario){
        return usuarioRepositorio.findById(usuario.getId()).orElse(null);
    }
    
    public List<Usuario> listarUsuarios(){
        return usuarioRepositorio.findAll();
    }
}
