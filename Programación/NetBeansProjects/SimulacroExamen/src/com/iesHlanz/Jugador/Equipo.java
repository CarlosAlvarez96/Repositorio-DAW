
package com.iesHlanz.Jugador;

import java.util.ArrayList;
import java.util.List;


public class Equipo {
    List<Jugador> jugadoresEquipo;
    
    public Equipo(){
        this.jugadoresEquipo = new ArrayList<>();
        
    }
    
    public void añadirJugador(Jugador player){
        this.jugadoresEquipo.add(player);
    }
}
