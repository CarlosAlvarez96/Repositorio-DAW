
package com.iesHlanz.perros;


public class Perro {
    private String nombre;
    private int precio;
    private String raza;
    
    public Perro(String n, int p, String r) {
        this.nombre=n;
        if(p>=0){
            this.precio=p;
        }else{
            throw new IllegalArgumentException("Precio negativo");
        }
        this.raza=r;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public String getRaza() {
        return raza;
    }
    
    
}
