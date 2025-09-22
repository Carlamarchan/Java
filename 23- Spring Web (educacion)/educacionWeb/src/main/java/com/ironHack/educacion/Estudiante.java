package com.ironHack.educacion;


import org.springframework.data.relational.core.mapping.Column;

public class Estudiante{
    private Integer id_estudiante;
    private String nombre;
    private String apellido;
    private Integer id_colegio;


    public  Estudiante(){

    }

    public Estudiante(Integer id, String nombre, String apellido, Integer id_colegio) {
        this.id_estudiante = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.id_colegio = id_colegio;
    }

    public Integer getId_estudiante() {
        return id_estudiante;
    }

    public void setId_estudiante(Integer id_estudiante) {
        this.id_estudiante = id_estudiante;
    }

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

    public Integer getId_colegio() {
        return id_colegio;
    }

    public void setId_colegio(Integer id_colegio) {
        this.id_colegio = id_colegio;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "id_estudiante=" + id_estudiante +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", id_colegio=" + id_colegio +
                '}';
    }
}
