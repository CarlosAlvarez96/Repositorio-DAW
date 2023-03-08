
package com.iesHlanz.ejerciciosT5;

import static com.iesHlanz.ejerciciosT5.EstadoCivil.SOLTERO;


public class PersonaBuilder {
     private String nombre;
    private String Apellido1;
    private String Apellido2;
    private int edad;
    private String calle;
    private String ciudad;
    private String pais;
    private String telefono;
    private EstadoCivil estadoCivil;
    private Persona pareja;
    
    public PersonaBuilder(String nombre, String apellido1, String apellido2){
        this.nombre = nombre;
        this.Apellido1 = apellido1;
        this.Apellido2 = apellido2;
        this.edad = 0; 
        this.calle = null ;
        this.ciudad = null ;
        this.pais = "España";
        this.telefono = null;
        this.estadoCivil = SOLTERO;
        this.pareja = null;
    }
    public PersonaBuilder setEdad(int e){
        this.edad=e;
        return this;
    }
    public PersonaBuilder setCalle(String c){
        this.calle=c;
        return this;
    }
    public PersonaBuilder setCiudad(String c){
        this.ciudad=c;
        return this;
    }
    public PersonaBuilder setPais(String p){
        this.pais=p;
        return this;
    }
    public PersonaBuilder setEstadoCivil(EstadoCivil e){
        this.estadoCivil=e;
        return this;
    }
    public PersonaBuilder setPareja(Persona p){
        this.pareja=p;
        return this;
    }
    public ImplementacionPersona build(){
        return new ImplementacionPersona (nombre,this.Apellido1,this.Apellido2,edad,calle,ciudad,pais,telefono,this.estadoCivil,this.pareja);
    }
}
