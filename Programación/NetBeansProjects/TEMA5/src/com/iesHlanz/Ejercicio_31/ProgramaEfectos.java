
package com.iesHlanz.Ejercicio_31;

import java.util.Scanner;


public class ProgramaEfectos {
    public static void main(String[] args) {
        System.out.println("Introduzca su nombre");
        String sc = new Scanner(System.in).nextLine();
        EfectoEspecial eE = EfectoFactory.getEfecto(TipoEfecto.CORCHETES);
        String inverso= eE.aplicarEfecto(sc);
        System.out.println(inverso);
    }
}
