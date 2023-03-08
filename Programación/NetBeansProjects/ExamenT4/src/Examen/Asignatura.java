
package Examen;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Asignatura implements PoseedorFaltas{

    public static final Map PRIMERO = Map.of("Programacion", 256, 
                                                                       "Lenguaje de marcas", 128,
                                                                       "Sistemas informáticos", 192,
                                                                       "Bases de datos", 192,
                                                                       "Fol" , 96);
    private String nombre;
    private int numeroHoras;
    private List<Alumno> alumnosMatriculados;
    
    public Asignatura(String n, int nH){
        if(nH <=0){
                throw new IllegalArgumentException("Número de horas incorrecto");
        }
        this.nombre=n;
        this.numeroHoras=nH;
        this.alumnosMatriculados= new ArrayList<>();
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getNumeroHoras(){
        return this.numeroHoras;
    }
    public List<Alumno> getAlumnosMatriculados(){
        return this.alumnosMatriculados;
    }
    public void Matricular(Alumno a){
        for(Alumno i : this.alumnosMatriculados){
            if(i.getDni().equals(a.getDni())){
                throw new IllegalArgumentException("El alumno ya está matriculado");
            }
        }
        this.alumnosMatriculados.add(a);
    }
    public List<Falta> getFaltas(Alumno a){
        return a.getFaltas();
    }
    public boolean admiteEvaluacionContinua(Alumno a){
        boolean admite = false;
        int contadorFaltasNoJustificadas =0;
        List<Falta> faltas = a.getFaltas();
        for(Falta i : faltas){
           if( i.tipo().equals(TipoFalta.INJUSTIFICADA)){
               contadorFaltasNoJustificadas++;
           }
        }
        if(this.numeroHoras/5>=contadorFaltasNoJustificadas){
            admite =true;
        }
        return admite;
    
    
    
}

    @Override
    public List<Falta> getFaltas() {
        List<Falta> faltas = new ArrayList<>();
        for(Alumno i : this.alumnosMatriculados){
            List<Falta> faltasAlumno =i.getFaltas();
            for (Falta o : faltasAlumno) {
                faltas.add(o);
            }
        }
        return faltas;
        }
    }
