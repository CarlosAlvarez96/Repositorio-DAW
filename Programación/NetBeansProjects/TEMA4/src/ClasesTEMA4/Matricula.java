package ClasesTEMA4;

/*----------------------EJERCICIO27-----------------------*/
public class Matricula {

    private static int siguienteNumeroMatricula = 1;
    private int numeroMatricula;
    private String nombreAlumno;
    private String nombreAsignatura;

    public Matricula(String nombreAlumno, String nombreAsignatura) {
        Matricula m = new Matricula(this.nombreAlumno, this.nombreAsignatura);
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public int getNúmeroMatrícula() {
        numeroMatricula += siguienteNumeroMatricula;
        return numeroMatricula;
    }
}
