
package com.iesHlanz.Paciente;

import java.util.ArrayList;
import java.util.List;


public class Hospital {
    private List<Paciente> pacientes;
    
    public Hospital(){
        this.pacientes= new ArrayList<>();
        pacientes.add(new Paciente(123456,"Paco"));
    }
    //Este metodo devuelve true si el paciente esta en la lista
    public boolean pacienteIngresado(Paciente p){
        return pacientes.contains(p);
    }
    
}
