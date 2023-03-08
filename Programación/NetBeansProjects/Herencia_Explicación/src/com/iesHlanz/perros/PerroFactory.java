package com.iesHlanz.perros;

import java.util.Random;

public class PerroFactory {
    //Este metodo saca un numero aleatorio entre 0 y 1, si sale menor de 0,5 se devuelve un 
    //perro cuyo nombre y raza se saca aleatoriamente de esta lista

    //nombre -> "boby", "max", "luna", "eros"
    //raza -> "bulldog", "golden", "setter", "labrador"
    //El precio del perro (no abandonado) estará entre 200 y 1000 euros
    // Si es abandonado es 0
    // SI sale mayor o igual a 0.5, se devuelve un PerroAbandonado cuyo nombre y raza se sacan aleatoriamente
    // de las listas aleatoriamente
    public static Perro generarPerroAleatorio() {
        Perro resultado = null;
        double tipo = Math.random();
        String[] nombresPosibles = {
            "boby", "max", "luna", "eros"
        };
        String[] razasPosibles = {
            "bulldog", "golden", "setter", "labrador"
        };
        String nombre = nombresPosibles[new Random().nextInt(nombresPosibles.length)];
        String raza = razasPosibles[new Random().nextInt(razasPosibles.length)];
        int precio = 0;
        if (tipo < 0.5) {
            //Perro
            precio = new Random().nextInt(200, 1000);
            resultado = new Perro(nombre,precio,raza);
        } else if (tipo >= 0.5) {
            //Perro abandonado
            precio = new Random().nextInt(100, 300);
            resultado = new PerroAbandonado(nombre,precio,raza);
        }
        
        return resultado;
    }
}
