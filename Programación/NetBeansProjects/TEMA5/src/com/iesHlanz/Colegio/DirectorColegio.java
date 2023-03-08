
package com.iesHlanz.Colegio;

import java.util.ArrayList;
import java.util.List;

public class DirectorColegio extends EmpleadoColegio{

    private List<Double> notasColegio;
    
    public DirectorColegio(String nombre, String colegio){
        super(nombre,colegio);
        this.notasColegio= new ArrayList<>();
    }
    public double getNotaMediaColegio(){
        double notaMedia=0;
        for(double i : this.notasColegio){
            notaMedia+=i;
        }
        return notaMedia/this.notasColegio.size();
    }
            
    @Override
    public void recibirCalificacion(Profesor p, Alumno a, Nota nota) {
        notasColegio.add(nota.valorNumerico());
    }


    
}
