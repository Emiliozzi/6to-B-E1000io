/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

/**
 *
 * @author emili
 */
public class estudiante {
    private String nombre;
    private int edad;
    private int legajo;
    private String curso;

 

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getLegajo() {
        return legajo;
    }

    public String getCurso() {
        return curso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
           
}
