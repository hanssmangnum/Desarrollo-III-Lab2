package com.taller.controller;

// import com.taller.entity.Cliente;
// import com.taller.service.ClienteService;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.*;
// import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Vista web de Cliente (Thymeleaf). Responsable: Persona A
 * Listado de Clientes: ver todos + registrar/editar/eliminar
 *
 * TODO: descomentar y completar.
 *
 *   @Controller
 *   @RequestMapping("/clientes")
 *   public class ClienteController {
 *
 *       // Inyectar ClienteService (y los otros servicios si hay <select>)
 *
 *       @GetMapping                          // GET  /clientes               -> model.addAttribute("lista", ...) ; return "clientes/lista";
 *       @GetMapping("/nuevo")                // GET  /clientes/nuevo         -> formulario vacio ; return "clientes/form";
 *       @GetMapping("/editar/{id}")          // GET  /clientes/editar/1      -> formulario con datos
 *       @PostMapping("/guardar")             // POST /clientes/guardar       -> guardar + redirectAttributes.addFlashAttribute("mensaje", "Guardado correctamente") ; return "redirect:/clientes";
 *       @GetMapping("/eliminar/{id}")        // GET  /clientes/eliminar/1    -> eliminar + mensaje de confirmacion
 *   }
 */
public class ClienteController {
}
