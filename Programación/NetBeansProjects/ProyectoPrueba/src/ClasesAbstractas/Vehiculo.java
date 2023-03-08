
package ClasesAbstractas;

import java.awt.Color;


public abstract class Vehiculo {
    private String[] pasajeros;
    private int velocidadMaximaReglamentaria;
    private Color color;
    
    public Vehiculo(int numeroPlazas,int vm,Color c){
        this.pasajeros= new String[numeroPlazas];
        this.velocidadMaximaReglamentaria=vm;
        this.color=c;
    }
    public void añadirPasajero(String nombre, int sitio){
        pasajeros[sitio]=nombre;
    }
    public int getNumeroPasajeros(){
        int contador=0;
        for(int i=0;i<pasajeros.length;i++){
            if(pasajeros[i]!=null){
                contador++;
            }
        }
        return contador;
    }
    public abstract void mover(int x,int y);
}
