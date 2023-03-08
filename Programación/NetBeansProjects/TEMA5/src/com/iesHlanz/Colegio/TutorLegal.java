
package com.iesHlanz.Colegio;


public record TutorLegal(String nombre,Alumno[] hijos) implements CalificacionListener {

    @Override
    public void recibirCalificacion(Profesor p, Alumno a, Nota nota) {
        boolean contiene = false;
        for(int i=0; i<hijos.length;i++){
            if(a.equals(hijos[i])){
                contiene = true;
            }
        }
        if(contiene){
            if(nota.getValoracion().esAprobado()){
                System.out.println("Bien hecho "+a.nombre()+", has sacado un "+nota.toString()+"en "+p.getAsignatura());
            }else{
                System.out.println("Muy mal "+a.nombre()+", has suspendido"+p.getAsignatura()+" y te voy a castigar");
            }
        }
    }
    
}
