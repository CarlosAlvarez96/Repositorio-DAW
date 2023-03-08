
package com.iesHlanz.Ej_22_23_24;

import java.util.Objects;


public abstract class Animal {
    private String nombre;
    private int peso;
    private boolean encerrado;
    
    public Animal(String n, int p){
        this.nombre=n;
        this.peso=p;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean isEncerrado() {
        return encerrado;
    }

     void setEncerrado(boolean encerrado) {
        this.encerrado = encerrado;
    }
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Animal other = (Animal) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    public abstract void emitirSonido();
    
}

