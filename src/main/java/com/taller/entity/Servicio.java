package com.taller.entity;

// import jakarta.persistence.*;
// import com.fasterxml.jackson.annotation.JsonIgnore;
// import java.time.LocalDate;      // solo Servicio
// import java.util.ArrayList;
// import java.util.List;

/**
 * Responsable: Persona B
 *
 * TODO: descomentar los imports y el codigo de abajo, y borrar el cuerpo vacio.
 * Campos:
 *   - Long id
 *   - LocalDate fecha
 *   - String descripcion
 *   - Double costo
 * Relaciones:
 *   - Muchos servicios pertenecen a un vehiculo (FK vehiculo_id):
 *       @ManyToOne @JoinColumn(name = "vehiculo_id")
 *       private Vehiculo vehiculo;
 *   - Un servicio tiene muchos repuestos:
 *       @OneToMany(mappedBy = "servicio", cascade = CascadeType.ALL)
 *       @JsonIgnore
 *       private List<Repuesto> repuestos = new ArrayList<>();
 */
// @Entity
// @Table(name = "servicio")
public class Servicio {

    // TODO: agregar los campos, constructor vacio, getters y setters.

}
