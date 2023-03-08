package Juego;

import java.util.Scanner;

public class Juego_Naves {
    public static void main(String[] args) {
        System.out.println("""
                           ELIGE TU NAVE:
                           ------------------------
                           1) NAVE A
                           2) NAVE B
                           3) NAVE C
                           """);
        //Hago una variable para guardar la nave del jugador
        Nave player1= null;
        int opcion = new Scanner(System.in).nextInt();
        player1  = switch(opcion){
            case 1 -> new NaveA();
            case 2 -> new NaveB();
            case 3 -> new NaveC();
            default -> throw new IllegalArgumentException("Opcion no válida");
        };
        
        // ========================================================
        // ||  A partir de este momento el programa es independiente 
        // ||  del tipo de nave elegido
        //========================================================
        player1.disparar();
        player1.poderEspecial();
    }
}
