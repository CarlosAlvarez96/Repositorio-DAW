import java.util.*;

public class EJERCICIO22 {
    public static void main(String args[]) {
        int pTotales = 30;
        int opciones = 4;
        int pRestan = 3;
        int rCorrectas = 22;
        int rSinContestar = 2;
        int rMal = 6;
        double notaPorPregunta = 100 / 30;
        double notaAlumno = (rCorrectas * notaPorPregunta) - (rMal / 3 * notaPorPregunta);
        System.out.println("La nota del alumno es: " + (notaAlumno / 10));
    }
}
