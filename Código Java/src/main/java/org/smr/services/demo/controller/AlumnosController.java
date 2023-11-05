package org.smr.services.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

//@RestController
@Controller
public class AlumnosController {
    private List<String> listaStringAlumnos = List.of("test1","test2","test3");
    private List<Alumno> alumnos = new ArrayList<Alumno>();

    @GetMapping("/home")
    public String getHome(){
        return "redirect:/";
    }

    @GetMapping("/consultar")
    public String consultarAlumnos(Model model) {
        // Hacer una solicitud GET al API REST de Java para obtener la lista de alumnos
        RestTemplate restTemplate = new RestTemplate();
        //alumnos.add(new Alumno("Test", "test", "test"));
        // Agregar la lista de alumnos al modelo para Thymeleaf
        model.addAttribute("alumnos", alumnos);
        return "consultar_alumnos";
    }

    public List getAlumnos(){
        return alumnos;
    }


    @PostMapping("/crear")
    public String crearAlumno(@RequestParam String nombre, @RequestParam String apellido, @RequestParam String expediente) {

        Alumno nuevoAlumno = new Alumno(nombre,apellido,expediente);
        alumnos.add(nuevoAlumno);
        // Redirige a alguna página de éxito o a donde desees después de procesar los datos.
        return "redirect:/consultar_alumnos";
    }


}
