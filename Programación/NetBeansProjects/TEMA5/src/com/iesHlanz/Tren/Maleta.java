
package com.iesHlanz.Tren;

public record Maleta(Persona dueño, int peso) implements Pesado{

    @Override
    public int getPeso() {
        return peso;
    }
    
}
