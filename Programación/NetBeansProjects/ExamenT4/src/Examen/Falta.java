
package Examen;

import java.time.LocalDate;
import java.util.List;


public record Falta(Alumno alumno, Asignatura asignatura, LocalDate fecha, int hora, TipoFalta tipo) {
    public Falta{
        if(this.validarHora()==false){
            throw new IllegalArgumentException("Hora incorrecta");
        }
        if(this.validarMatriculacion()==false){
            throw new IllegalArgumentException("El alumno no está matriculado en la asignatura");
        }
    }
    public Falta justificar(){
        Falta f =  new Falta(this.alumno,this.asignatura,this.fecha,this.hora, TipoFalta.JUSTIFICADA);
        return f;
    }
    private boolean validarHora(){
        return this.hora<0 && this.hora<7;
    }
    private boolean validarMatriculacion(){
        boolean valido = false;
        List <Alumno> alumnos = this.asignatura.getAlumnosMatriculados();
        for (Alumno i : alumnos){
            if(this.alumno.getDni().equals(i.getDni())){
                valido = true;
            }
        }
        return valido;
    }
}
