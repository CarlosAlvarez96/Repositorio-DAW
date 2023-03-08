
package com.iesHlanz.ejerciciosT5;


public interface Persona {
    public String getNombre();
    public String getApellido1();
    public String getApellido2();
    public default String [] getApellidos(){
        String [] s  = {this.getApellido1(),this.getApellido2()};
        return s;
    }
    public Direccion getDireccion();
    public String getTelefono();
    public EstadoCivil getEstadoCivil();
    public Persona getPareja();
}
