
package com.iesHlanz.Paciente;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Paciente {
    private int numeroSeguridadSocial;
    private String nombre;
    private List<String> enfermedades;
    
    public Paciente(int ns, String n){
        this.numeroSeguridadSocial=ns;
        this.nombre=n;
        enfermedades = new ArrayList<>();
    }
    // Este metodo devuelve true si el parametro es de tipo paciente
    //y coincide su nombre, ns y lista enfermedades
    /*
    @Override
    public boolean equals(Object o){
        boolean resultado=false;
        if(o instanceof Paciente p){
            resultado = this.nombre.equals(p.nombre) && 
                              this.numeroSeguridadSocial==p.getNumeroSeguridadSocial()&&
                              this.enfermedades.equals(p.enfermedades);
            
        }
        return resultado;
    }
    
    @Override 
    public int hashCode(){
        return 3*this.numeroSeguridadSocial
                +17*this.nombre.hashCode()
                +7*this.enfermedades.hashCode();
    }
    
    @Override
    public String toString(){
        return this.numeroSeguridadSocial+"..."+this.nombre+": "+this.enfermedades.toString();
    }
*/

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + this.numeroSeguridadSocial;
        hash = 71 * hash + Objects.hashCode(this.nombre);
        hash = 71 * hash + Objects.hashCode(this.enfermedades);
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
        final Paciente other = (Paciente) obj;
        if (this.numeroSeguridadSocial != other.numeroSeguridadSocial) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.enfermedades, other.enfermedades);
    }
    
    
    public int getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public String getNombre() {
        return nombre;
    }

    public List<String> getEnfermedades() {
        return enfermedades;
    }
    
}
