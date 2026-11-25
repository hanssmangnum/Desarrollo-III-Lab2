-- Datos de ejemplo (minimo 2 clientes, 2 vehiculos, 2 servicios, 2 repuestos).
-- IMPORTANTE: respetar este orden por las llaves foraneas.
-- Los nombres de columna son los de las entidades en snake_case (cliente_id, vehiculo_id, servicio_id).

-- ===== Persona A: clientes =====
-- TODO: INSERT INTO cliente (id, nombre, telefono, correo, direccion) VALUES (1, '...', '...', '...', '...');
-- TODO: (2 clientes como minimo)

-- ===== Persona A: vehiculos =====
-- TODO: INSERT INTO vehiculo (id, placa, marca, modelo, tipo, cliente_id) VALUES (1, 'ABC123', '...', '...', 'automovil', 1);
-- TODO: (2 vehiculos como minimo)

-- ===== Persona B: servicios =====
-- TODO: INSERT INTO servicio (id, fecha, descripcion, costo, vehiculo_id) VALUES (1, '2026-01-15', '...', 150000.0, 1);
-- TODO: (2 servicios como minimo)

-- ===== Persona B: repuestos =====
-- TODO: INSERT INTO repuesto (id, nombre, precio, servicio_id) VALUES (1, '...', 50000.0, 1);
-- TODO: (2 repuestos como minimo)
