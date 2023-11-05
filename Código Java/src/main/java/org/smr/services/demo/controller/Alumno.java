package org.smr.services.demo.controller;

public class Alumno {
    private String nombre;
    private String apellido;
    private String expediente;

    // Constructor
    public Alumno(String nombre, String apellido, String expediente) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.expediente = expediente;
    }

    // Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getExpediente() {
        return expediente;
    }

    public void setExpediente(String expediente) {
        this.expediente = expediente;
    }
}

