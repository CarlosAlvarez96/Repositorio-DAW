
package com.iesHlanz.Jugador;


public class Futbolista implements Jugador{

    String nombre;
    int goles;
    
    private Futbolista(String nombre, int goles){
        this.nombre= nombre;
        this.goles= goles;
    }
    @Override
    public void gol() {
        this.goles+=1;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public int getGoles() {
        return this.goles;
    }
    
}
