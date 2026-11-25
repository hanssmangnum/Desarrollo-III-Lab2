package com.taller.controller;

// import com.taller.entity.Repuesto;
// import com.taller.service.RepuestoService;
// import org.springframework.stereotype.Controller;
// import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.*;
// import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * Vista web de Repuesto (Thymeleaf). Responsable: Persona B
 * Gestion de Repuestos: listar y asociarlos a un servicio (<select> de servicios)
 *
 * TODO: descomentar y completar.
 *
 *   @Controller
 *   @RequestMapping("/repuestos")
 *   public class RepuestoController {
 *
 *       // Inyectar RepuestoService (y los otros servicios si hay <select>)
 *
 *       @GetMapping                          // GET  /repuestos               -> model.addAttribute("lista", ...) ; return "repuestos/lista";
 *       @GetMapping("/nuevo")                // GET  /repuestos/nuevo         -> formulario vacio ; return "repuestos/form";
 *       @GetMapping("/editar/{id}")          // GET  /repuestos/editar/1      -> formulario con datos
 *       @PostMapping("/guardar")             // POST /repuestos/guardar       -> guardar + redirectAttributes.addFlashAttribute("mensaje", "Guardado correctamente") ; return "redirect:/repuestos";
 *       @GetMapping("/eliminar/{id}")        // GET  /repuestos/eliminar/1    -> eliminar + mensaje de confirmacion
 *   }
 */
public class RepuestoController {
}
