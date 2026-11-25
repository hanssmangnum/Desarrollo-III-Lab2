package com.taller.entity;

// import jakarta.persistence.*;
// import com.fasterxml.jackson.annotation.JsonIgnore;
// import java.time.LocalDate;      // solo Servicio
// import java.util.ArrayList;
// import java.util.List;

/**
 * Responsable: Persona A
 *
 * TODO: descomentar los imports y el codigo de abajo, y borrar el cuerpo vacio.
 * Campos:
 *   - Long id            -> @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
 *   - String nombre
 *   - String telefono
 *   - String correo
 *   - String direccion
 * Relacion: un cliente tiene muchos vehiculos
 *   @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
 *   @JsonIgnore   // evita bucle infinito en el JSON
 *   private List<Vehiculo> vehiculos = new ArrayList<>();
 */
// @Entity
// @Table(name = "cliente")
public class Cliente {

    // TODO: agregar los campos, constructor vacio, getters y setters.

}
