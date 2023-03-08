
package com.iesHlanz.Ej_10_11_12;


public class Empleado implements Nombrable{
    private String nombre;
    private double sueldo;
    private double dinero;
    
    public Empleado(String n, double s){
        this.nombre=n;
        this.sueldo=s;
        this.dinero=0;
    }
    public double getSueldo(){
        return this.sueldo;
    }
    public double getDinero(){
        return this.dinero;
    }
    public void cobrar(double cantidad) throws CabreoException{
        this.dinero+=cantidad;
        if(cantidad<this.sueldo){
            throw new CabreoException("El empleado "+this.nombre+"no se le han pagado "+this.sueldo+" euros");
        }
    }
    
    
    @Override
    public String getNombre() {
        return this.nombre;
    }
    
}
