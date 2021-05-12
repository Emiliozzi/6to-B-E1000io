/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switch3;

import java.util.Scanner;

/**
 *
 * @author emili
 */
public class Switch3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        char caracter;
        System.out.println("teclea un carácter: ");
        caracter = entrada.next().charAt(0);
        switch (caracter) {
            case 'a':
                System.out.println("El carácter es vocal, la A");
                break;
            case 'e':
                System.out.println("El carácter es vocal, la E");
                break;
            case 'i':
                System.out.println("El carácter es vocal, la I");
                break;
            case 'o':
                System.out.println("El carácter es vocal, la O");
                break;
            case 'u':
                System.out.println("El carácter es vocal, la U");
                break;
            default:
                System.out.println("No es una vocal");
                break;
        }
    }

}
