import java.util.*;
public class EJERCICIO18 {
    public static void main(String args[]) {
        System.out.println("Introduzca el precio por hora:");
        int precioHora= new Scanner(System.in).nextInt();
        System.out.println("Introduzca las clases semanales del primer alumno:");
        int clasesSemanaAlumno1= new Scanner(System.in).nextInt();
        System.out.println("Introduzca las clases semanales del segundo alumno:");
        int clasesSemanaAlumno2= new Scanner(System.in).nextInt();
        int horasAlMes= (clasesSemanaAlumno1*4)+(clasesSemanaAlumno2*4);
        System.out.println("Al mes ganará: "+(horasAlMes*precioHora)+" euros");
        System.out.println("Necesitará echar "+(900/precioHora)+" horas para ganar 900 euros");
    }
}
