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
 *   - Long id
 *   - String placa
 *   - String marca
 *   - String modelo      (modelo o ano)
 *   - String tipo        (automovil, moto, camion, etc.)
 * Relaciones:
 *   - Muchos vehiculos pertenecen a un cliente (FK cliente_id):
 *       @ManyToOne @JoinColumn(name = "cliente_id")
 *       private Cliente cliente;
 *   - Un vehiculo tiene muchos servicios:
 *       @OneToMany(mappedBy = "vehiculo", cascade = CascadeType.ALL)
 *       @JsonIgnore
 *       private List<Servicio> servicios = new ArrayList<>();
 */
// @Entity
// @Table(name = "vehiculo")
public class Vehiculo {

    // TODO: agregar los campos, constructor vacio, getters y setters.

}
