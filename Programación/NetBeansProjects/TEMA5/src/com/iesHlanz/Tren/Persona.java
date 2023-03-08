
package com.iesHlanz.Tren;

public class Persona implements Pesado{
    private String nombre;
    private int peso;
    private Maleta equipaje;
    
    public Persona(String n, int p, int kgEquipaje){
        this.nombre=n;
        this.peso=p;
        if(kgEquipaje>0){
        this.equipaje= new Maleta(this,kgEquipaje);
        }else if(kgEquipaje==0){
            this.equipaje=null;
        }else if(kgEquipaje<0){
            throw new IllegalArgumentException ("El peso de la maleta no puede ser negativo");
        }
    }

    public void setEquipaje(Maleta equipaje) {
        this.equipaje = equipaje;
    }

    public String getNombre() {
        return nombre;
    }

    public Maleta getMaleta() {
        return equipaje;
    }
    
    @Override
    public int getPeso() {
        return this.peso;
    }
    
    public Persona(String n, int p){
        this.nombre=n;
        this.peso=p;
    }

    
}
