
import java.util.Scanner;

public class EXAMEN6 {

    public static void main(String args[]) {
        System.out.println("Introduzca un entero con el día");
        int dia = new Scanner(System.in).nextInt();
        System.out.println("Introduzca un entero con el mes");
        int mes = new Scanner(System.in).nextInt();
        System.out.println("Introduzca un entero con el año");
        int año = new Scanner(System.in).nextInt();
        int[] diasmes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (año > 0 && mes >= 1 && mes <= 12 && dia <= diasmes[mes - 1]) {
            System.out.println("Es una fecha válida");
            int totalDias = 24 + (31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30) + (2021 * 365);
            int diasEdad = dia + (mes - 1) * 30 + (año - 1) * 365;
            int edad = (totalDias - diasEdad) / 365;
            System.out.println("Tiene " + edad + "años");
        } else {
            System.out.println("No es una fecha válida");
        }

    }
}
