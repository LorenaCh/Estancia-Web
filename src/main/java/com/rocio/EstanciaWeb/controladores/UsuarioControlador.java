package com.rocio.EstanciaWeb.controladores;

import com.rocio.EstanciaWeb.entidades.Usuario;
import com.rocio.EstanciaWeb.servicios.UsuarioServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Rocio
 */

@Controller
@RequestMapping("/usuario") //localhost:8080/usuario
public class UsuarioControlador {
    
    @Autowired
    private UsuarioServicio usuarioServicio;
    
    @GetMapping("") //localhost:8080/usuario
    public String lista(Model model){
        List<Usuario> lista = usuarioServicio.listarUsuarios();
        model.addAttribute("usuarios",lista);
        return "usuarios";
    }
    
    @GetMapping("/crear") //localhost:8080/usuario/crear
    public String crearUsuario(){
        return "crearUsuario";
    }
    
    @PostMapping("/guardar") //localhost:8080/usuario/guardar
    public String guardarUsuario(Usuario usuario,Errors errores){
        usuarioServicio.guardar(usuario);
        if(errores.hasErrors()){
            return "crearUsuario";
        }
        return "redirect:";
    }
    
    @GetMapping("/editar") //localhost:8080/usuario/editar/1
    public String editarUsuario(Usuario usuario,Model model){
        usuario = usuarioServicio.buscarPorId(usuario);
        model.addAttribute("usuario",usuario);
        return "editarUsuario";
    }
    
    @GetMapping("/eliminar") //localhost:8080/usuario/eliminar
    public String eliminarUsuario(Usuario usuario){
        usuario = usuarioServicio.buscarPorId(usuario);
        usuarioServicio.eliminar(usuario);
        return "redirect:";
    }
}
