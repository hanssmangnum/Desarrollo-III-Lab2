# Taller Automotriz - Laboratorio 2 C

Proyecto Spring Boot (Java 17, Maven) con la estructura lista y el codigo **comentado para rellenar**.
Busca `TODO` en los archivos para saber que falta.

## Como ejecutar
```
mvn spring-boot:run
```
App: http://localhost:8080 - Consola H2: http://localhost:8080/h2-console (jdbc:h2:mem:tallerdb, usuario `sa`, sin clave)

## Reparto
| | Persona A | Persona B |
|---|---|---|
| Entidades | Cliente, Vehiculo | Servicio, Repuesto |
| API REST | /api/clientes, /api/vehiculos | /api/servicios, /api/repuestos |
| Vistas | clientes/, vehiculos/ | servicios/, repuestos/ |
| Extra A | fragments/menu.html, index.html, InicioController | |
| data.sql | secciones de clientes y vehiculos | secciones de servicios y repuestos |

## Pasos para cada archivo
1. Entidad (`entity/`): descomentar, agregar campos y relaciones.
2. Repositorio (`repository/`): extender `JpaRepository`.
3. Servicio (`service/`): listar, buscar, guardar, eliminar.
4. Controlador REST (`controller/*RestController`): CRUD en `/api/...`.
5. Controlador MVC (`controller/*Controller`) y plantillas (`templates/...`).
6. `data.sql` con los datos de ejemplo.

Entregables: .zip, data.sql, capturas del menu y listados, documento (integrantes, relaciones, endpoints).
