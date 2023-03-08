
package com.iesHlanz.Ej_22_23_24;

public class Jaula extends ContenedorAnimales{
    private int capacidadMaxima;
    private int pesoMaximo;

    public Jaula(int cm, int pm){
        this.capacidadMaxima=cm;
        this.pesoMaximo=pm;
    }
    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getPesoMaximo() {
        return pesoMaximo;
    }
    
    @Override
    protected boolean comprobarDisponibilidadPlaza(Animal a) {
        boolean disponible = false;
        if(this.capacidadMaxima>super.getNumeroAnimales() && this.pesoMaximo>super.getPesoActual()+a.getPeso()){
            disponible= false;
        }
        return disponible;
    }
    
}
