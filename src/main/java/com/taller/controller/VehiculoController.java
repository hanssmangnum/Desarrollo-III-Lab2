package com.taller.controller;

// import com.taller.entity.Vehiculo;
// import com.taller.service.VehiculoService;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.*;
// import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Vista web de Vehiculo (Thymeleaf). Responsable: Persona A
 * Listado de Vehiculos: mostrar el cliente asociado (usar un <select> de clientes en el formulario)
 *
 * TODO: descomentar y completar.
 *
 *   @Controller
 *   @RequestMapping("/vehiculos")
 *   public class VehiculoController {
 *
 *       // Inyectar VehiculoService (y los otros servicios si hay <select>)
 *
 *       @GetMapping                          // GET  /vehiculos               -> model.addAttribute("lista", ...) ; return "vehiculos/lista";
 *       @GetMapping("/nuevo")                // GET  /vehiculos/nuevo         -> formulario vacio ; return "vehiculos/form";
 *       @GetMapping("/editar/{id}")          // GET  /vehiculos/editar/1      -> formulario con datos
 *       @PostMapping("/guardar")             // POST /vehiculos/guardar       -> guardar + redirectAttributes.addFlashAttribute("mensaje", "Guardado correctamente") ; return "redirect:/vehiculos";
 *       @GetMapping("/eliminar/{id}")        // GET  /vehiculos/eliminar/1    -> eliminar + mensaje de confirmacion
 *   }
 */
public class VehiculoController {
}
