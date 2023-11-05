package org.smr.services.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;


@org.springframework.stereotype.Controller
public class HomeController {
    @RequestMapping("/")
    public String homePage(){
        return "home";
    }

    @RequestMapping("/crear_alumno")
    public String crearAlumno(){
        return "crear_alumno";
    }

    @RequestMapping("/consultar_alumnos")
    public String consultarAlumno(){
        return "consultar_alumnos";
    }



}
