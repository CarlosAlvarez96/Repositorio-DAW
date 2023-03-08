package com.iesHlanz.Ej_13_14_15_16;

import java.util.Random;

public class GeneradorContraseñas {

    private Random random;

    public GeneradorContraseñas() {
        this.random = new Random();
    }

    public GeneradorContraseñas(Random r) {
        this.random = r;
    }

    public String generarContraseña(int longitud) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < longitud; i++) {
            int alt = random.nextInt(3);
            if (alt == 0) {
                
                int ascii = random.nextInt(10) + 48;
                sb.append((char) ascii);
            } else if (alt == 1) {
                int ascii = random.nextInt(25) + 64;
                sb.append((char) ascii);
            } else if (alt == 2) {
                int ascii = random.nextInt(25) + 97;
                sb.append((char) ascii);
            }
        }
        return sb.toString();
    }

    public String generarContraseña() {
        return this.generarContraseña(8);
    }
}
