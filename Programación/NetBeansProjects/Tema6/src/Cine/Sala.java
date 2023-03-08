
package Cine;

import java.util.List;

public class Sala {
    private int numero;
    private int capacidad;
    private Pelicula pelicula;
    private List<Integer> plazaslibres;
    
    public Sala(int n, int c, Pelicula p){
        
    }

    public int getNumero() {
        return numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }
    
}
