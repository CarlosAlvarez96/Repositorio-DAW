import java.util.*;
public class EJERCICIO19 {
    public static void main(String args[]) {
        int sueldoBase= 200;
        int sueldoxAlumno= 15;
        int cantidadAlumnos= 30;
        int mensualidadxAlumno= 100;
        int sueldoFinal=sueldoBase+(sueldoxAlumno*cantidadAlumnos);
        System.out.println("El estudiante gana "+sueldoFinal+" euros.");
        System.out.println("La academia gana "+((cantidadAlumnos*mensualidadxAlumno) -sueldoFinal)+" euros");
        //preguntar al profesor por el error en linea 10
    }
}
