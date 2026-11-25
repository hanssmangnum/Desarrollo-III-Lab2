package com.taller.controller;

// import com.taller.entity.Servicio;
// import com.taller.service.ServicioService;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.*;
// import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Vista web de Servicio (Thymeleaf). Responsable: Persona B
 * Formulario de Servicio: registrar seleccionando el vehiculo (<select> de vehiculos)
 *
 * TODO: descomentar y completar.
 *
 *   @Controller
 *   @RequestMapping("/servicios")
 *   public class ServicioController {
 *
 *       // Inyectar ServicioService (y los otros servicios si hay <select>)
 *
 *       @GetMapping                          // GET  /servicios               -> model.addAttribute("lista", ...) ; return "servicios/lista";
 *       @GetMapping("/nuevo")                // GET  /servicios/nuevo         -> formulario vacio ; return "servicios/form";
 *       @GetMapping("/editar/{id}")          // GET  /servicios/editar/1      -> formulario con datos
 *       @PostMapping("/guardar")             // POST /servicios/guardar       -> guardar + redirectAttributes.addFlashAttribute("mensaje", "Guardado correctamente") ; return "redirect:/servicios";
 *       @GetMapping("/eliminar/{id}")        // GET  /servicios/eliminar/1    -> eliminar + mensaje de confirmacion
 *   }
 */
public class ServicioController {
}
