package com.company;
public class Materia {

    private Integer codigo;
    private String nombreM;
    private Integer numeroCreditos;
    private double nota;


    public Materia(Integer codigo, String nombreM, Integer numeroCreditos, double nota) {
        this.codigo = codigo;
        this.nombreM = nombreM;
        this.numeroCreditos = numeroCreditos;
        this.nota = nota;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombreM() {
        return nombreM;
    }

    public void setNombreM(String nombreM) {
        this.nombreM = nombreM;
    }

    public Integer getNumeroCreditos() {
        return numeroCreditos;
    }

    public void setNumeroCreditos(Integer numeroCreditos) {
        this.numeroCreditos = numeroCreditos;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double nota() throws valueExeption{
        if (nota <0.0 && nota> 5.0){
            throw new valueExeption("Valor de nota inválido", "1");
        }
        return nota;
    }
}