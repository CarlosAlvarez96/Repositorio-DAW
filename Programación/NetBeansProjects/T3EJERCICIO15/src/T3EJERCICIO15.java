
import java.time.*;
import java.util.Scanner;

/*
Ejercicio 15: Usa las clases LocalDate y DateTimeFormatter para hacer un programa que 
pregunte al usuario un número de mes (entre 1 y 12) y un año. El programa mostrará por 
pantalla todos los días de ese mes, con el siguiente formato: “día/mes/año y día de la semana”
 */
public class T3EJERCICIO15 {

    public static void main(String args[]) {
        System.out.println("Introduzca un mes (1 al 12)");
        int mes = new Scanner(System.in).nextInt();
        System.out.println("Introduzca un año(yyyy)");
        int año = new Scanner(System.in).nextInt();
        int dia = 1;

        for (int i = 0; i < 31; i++) {
            LocalDate 
        }
        fecha = LocalDate.of(año, mes, dia);
        int f = fecha.now();
        int j = fecha.getDayOfMonth();
        System.out.println(dia + "/" + mes + "/" + año);
    }
}
