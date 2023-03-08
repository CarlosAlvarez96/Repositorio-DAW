
package com.iesHlanz.Colegio;

import java.util.HashMap;
import java.util.Map;

public class JefeEstudios extends EmpleadoColegio{

    private Map<String,Integer> notasAsignatura;
    
    public JefeEstudios(String nombre, String colegio){
        super(nombre,colegio);
        this.notasAsignatura= new HashMap<>();
    }
    public int getNumeroSuspensos(String asignatura){
        int suspensos = 0;
        if(notasAsignatura.containsKey(asignatura)){
            for(String i : notasAsignatura.keySet()){
                if(asignatura.equals(i)){
                    if(this.notasAsignatura.getOrDefault(asignatura, 0)<5){
                        suspensos++;
                    }
                }
            }
        }else{
            throw new IllegalArgumentException("Esa asignatura no está en el map");
        }
        return suspensos;
    }
    
    
    
    @Override
    public void recibirCalificacion(Profesor p, Alumno a, Nota nota) {
        if(nota.valorNumerico()<5){
            this.notasAsignatura.put(p.getAsignatura(), (int)nota.valorNumerico());
        }
    }
    
}
