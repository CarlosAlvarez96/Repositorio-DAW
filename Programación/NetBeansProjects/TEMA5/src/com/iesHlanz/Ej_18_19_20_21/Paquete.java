
package com.iesHlanz.Ej_18_19_20_21;

import java.util.Objects;


public class Paquete implements Comparable<Paquete>{
    public static final int ALTA=1;
    public static final int MEDIA=2;
    public static final int BAJA=3;
    private String producto;
    private String direccionDestino;
    private int prioridad;   
    
    public Paquete(String pro,String dd,int pri) {
        this.producto=pro;
        if(pri>=ALTA &&  pri<=BAJA){
        this.prioridad=pri;
        }else{
            throw new IllegalArgumentException("La prioridad no es válida");
        }
        this.direccionDestino=dd;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public String getDireccionDestino() {
        return direccionDestino;
    }

    public void setDireccionDestino(String direccionDestino) {
        this.direccionDestino = direccionDestino;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public void setPrioridad(int prioridad) {
        this.prioridad = prioridad;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.producto);
        hash = 97 * hash + Objects.hashCode(this.direccionDestino);
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
        final Paquete other = (Paquete) obj;
        if (!Objects.equals(this.producto, other.producto)) {
            return false;
        }
        return Objects.equals(this.direccionDestino, other.direccionDestino);
    }

    @Override
    public int compareTo(Paquete o) {
       return this.prioridad - o.prioridad;
    }
    
    
}
