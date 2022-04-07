package com.rocio.EstanciaWeb.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy;
import org.springframework.boot.autoconfigure.web.WebProperties;
import lombok.Data;

@Data
@Entity
@Table(name="usuario")
public class Usuario implements Serializable{
    
    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String alias;
    private String email;
    private String clave;
    private Date fechaAlta;
    private Date fechaBaja;
}
