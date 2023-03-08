
package com.iesHlanz.Ej_10_11_12;

import java.util.ArrayList;
import java.util.List;


public class EquipoFutbol implements Nombrable{
    private String nombre;
    private List<Empleado> empleados;
    private double presupuesto;
    
    public EquipoFutbol(String n, double p){
        this.nombre=n;
        this.presupuesto=p;
        this.empleados = new ArrayList<>();
    }
    public List<Empleado> getEmpleados(){
            return this.empleados;
    }
    public double getPresupuesto(){
        return this.presupuesto;
    }
    public void addEmpleado(Empleado e){
        int contadorEntrenadores=0;
        int contadorFutbolistas=0;
        for(int i=0; i<26;i++);
        if(e instanceof Entrenador a){
            if(contadorEntrenadores==0){
            empleados.add(e);
            contadorEntrenadores+=1;
            }else{
                throw new IllegalArgumentException("No puede haber más de 1 entrenador");
            }
    }else if(e instanceof Futbolista j){
        if(contadorFutbolistas<25){
        empleados.add(e);
        contadorFutbolistas+=1;
        }else{
            throw new IllegalArgumentException("No puede haber más de 25 futbolistas");
        }
    }
        
    }
    public void pagarSueldoEmpleados(){
        try{
        for(int i=0; i<this.empleados.size();i++){
            Empleado e = this.empleados.get(i);
            if(e instanceof EmpleadoPrimable ep){
            ep.cobrar(ep.getSueldo());
                if(ep.esPrimado()){
                    ep.cobrar(ep.getSueldo()/10);
                }
            }
        }
        }catch (CabreoException e){
            System.out.println(e);
        }
    }
    @Override
    public String getNombre() {
        return this.nombre;
    }
    
}
