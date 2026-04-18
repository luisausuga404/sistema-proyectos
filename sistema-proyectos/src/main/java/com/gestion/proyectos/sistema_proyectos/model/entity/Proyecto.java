package com.gestion.proyectos.sistema_proyectos.model.entity;

import com.gestion.proyectos.sistema_proyectos.model.embeddable.ContactoCliente;
import com.gestion.proyectos.sistema_proyectos.model.enums.EstadoProyecto;
import com.gestion.proyectos.sistema_proyectos.model.enums.Prioridad;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "proyectos")
public class Proyecto extends BaseEntity {

    private String nombre;
    private String descripcion;

    @Enumerated(EnumType.STRING)
    private EstadoProyecto estado;

    @Enumerated(EnumType.STRING)
    private Prioridad prioridad;

    @Embedded
    private ContactoCliente contactoCliente;
}
