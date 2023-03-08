package Restaurante;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EquipoFutbol {

    private String nombre;
    private List<Futbolista> jugadores;
    private long presupuesto;

    public EquipoFutbol(String n, long p) {
        if (n.startsWith("FC") || n.startsWith("Atletico") || n.startsWith("Real") || n.startsWith("Deportivo")) {
            this.nombre = n;
        } else {
            throw new IllegalArgumentException("nombre incorrecto");
        }
        if (this.presupuesto < 0) {
            throw new IllegalArgumentException("Presupuesto negativo");
        } else {
            presupuesto = p;
        }
        jugadores = new ArrayList<>();
    }

    public int getNumeroJugadores() {
        return jugadores.size();
    }

    public long getSueldoJugadores() {
        long masaSalarial = 0;
        for (int i = 0; i < jugadores.size(); i++) {
            masaSalarial += jugadores.get(i).getSueldo();

        }
        return masaSalarial;
    }

    public List<Futbolista> getJugadores(String posicion) {
        List<Futbolista> j = new ArrayList<>();
        List<String> posiciones = List.of("portero", "defensa", "mediocentro", "delantero");
        if (posiciones.contains(posicion)) {
            for (int i = 0; i < jugadores.size(); i++) {
                if (jugadores.get(i).equals(posicion)) {
                    j.add(jugadores.get(i));
                }
            }
        } else {
            throw new IllegalArgumentException("posición inválida");
        }
        return j;
    }

    /*-----------------Deberes------------------*/
    public void contratar(Futbolista f) {
        jugadores.add(f);
    }

    public void contratar(String nombre, int dorsal) {
        this.nombre = nombre;
        Futbolista f = new Futbolista(dorsal, nombre);
        jugadores.add(f);

    }
    
    /*---------Ejemplo de clase con Exception---------------*/
    
    public void guardar(String ruta) throws IOException{
        
    }

}
