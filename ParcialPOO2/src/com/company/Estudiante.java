package com.company;

import java.util.ArrayList;

public class Estudiante {

    private String nombre;
    private String apellido;
    private String id;
    private String correoElectronico;


    private ArrayList<Materia> materias = new ArrayList<>();



    public Estudiante(String nombre, String apellido, String id, String correoElectronico) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.correoElectronico = correoElectronico;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(ArrayList<Materia> materias) {
        this.materias = materias;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Double calcularPromedio(){
        Double promedio = 0.0;
        for (Materia actual:materias){
            promedio += actual.getNota();
        }
        return promedio / materias.size();
    }

}
