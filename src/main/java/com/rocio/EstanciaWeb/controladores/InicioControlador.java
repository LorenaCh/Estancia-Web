
package com.rocio.EstanciaWeb.controladores;

import com.rocio.EstanciaWeb.entidades.Usuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Rocio
 */

@Controller
public class InicioControlador {
    
    
    
    @GetMapping("/") //localhost:8080/
    public String home(Model model){
        /*
        Usuario usuario = new Usuario();
        usuario.setId("1");
        usuario.setEmail("a@email.com");
        usuario.setClave("a");
        usuario.setAlias("a");
        usuario.setFechaAlta(new Date(2022, 2, 21));
        usuario.setFechaBaja(new Date(2022, 2, 25));
        
        
        Usuario usuario1 = new Usuario();
        usuario1.setId("2");
        usuario1.setEmail("b@email.com");
        usuario1.setClave("b");
        usuario1.setAlias("b");
        usuario1.setFechaAlta(new Date(2022, 2, 2));
        usuario1.setFechaBaja(new Date(2022, 2, 12));
        
        List<Usuario> lista = new ArrayList();
        
        lista.add(usuario);
        lista.add(usuario1);
        
        model.addAttribute("usuarios",lista);*/
        
        return "home";
    }
}
