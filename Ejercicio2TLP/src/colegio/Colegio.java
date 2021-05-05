/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colegio;

import javax.swing.JOptionPane;

/**
 *
 * @author emili
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numestudiantes = 1, i;
        estudiante alumnos[] = new estudiante[numestudiantes];
        

        for (i = 0; i < alumnos.length; i++) {
            
            alumnos[i] = new estudiante();

            alumnos[i].setLegajo(Integer.valueOf(JOptionPane.showInputDialog("Ingrese Legajo")));
            alumnos[i].setNombre(JOptionPane.showInputDialog("Ingrese Nombre"));
            alumnos[i].setEdad(Integer.valueOf(JOptionPane.showInputDialog("Ingrese Edad")));
            alumnos[i].setCurso(JOptionPane.showInputDialog("Ingrese Curso"));

        }

        for (i = 0; i < alumnos.length; i++) {

            JOptionPane.showMessageDialog(null, alumnos[i].getNombre() + " " + alumnos[i].getLegajo() + " " + alumnos[i].getEdad() + " " + alumnos[i].getCurso());

        }
    }

}
