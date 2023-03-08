
package com.iesHlanz.ejerciciosT5;

class ImplementacionPersona implements Persona{

    private String nombre;
    private String Apellido1;
    private String Apellido2;
    private int edad;
    private Direccion direccion;
    private String telefono;
    private EstadoCivil estadoCivil;
    private Persona pareja;
    
    public ImplementacionPersona(String nombre,  String apellido1, String apellido2, int edad, String calle,
              String ciudad, String pais,String telefono, EstadoCivil ec, Persona pareja){
        this.nombre= nombre;
        this.Apellido1= apellido1;
        this.Apellido2= apellido2;
        this.direccion= new Direccion(calle,ciudad,pais);
        this.estadoCivil=ec;
        this.edad=edad;
        this.telefono=telefono;
        this.pareja=pareja;
        if(this.comprobarEdad()==false){
            throw new IllegalArgumentException ("Edad incorrecta");
        }
        if(this.comprobarEstadoCivil()==false){
            throw new IllegalArgumentException ("Estado civil incorrecto");
        }
    }
    
    private boolean comprobarEdad(){
        return this.edad<0? true:false;
    }
    
    private boolean comprobarEstadoCivil(){
        return this.estadoCivil.ordinal()==0 && pareja==null || this.estadoCivil.ordinal()==1 && pareja!=null ? false: true;
    }
    
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String getApellido1() {
        return Apellido1;
    }

    @Override
    public String getApellido2() {
        return Apellido2; 
    }

    @Override
    public Direccion getDireccion() {
        return this.direccion;
    }

    @Override
    public String getTelefono() {
        return this.telefono;
    }

    @Override
    public EstadoCivil getEstadoCivil() {
        return this.estadoCivil;
    }

    @Override
    public Persona getPareja() {
        return this.pareja;
    }
    
}
