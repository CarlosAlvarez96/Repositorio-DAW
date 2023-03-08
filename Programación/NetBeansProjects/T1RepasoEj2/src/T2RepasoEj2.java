
import java.util.Scanner;

/*E jercicio 2: Imagina que acabas de abrir una nueva cuenta de ahorros que te ofrece el 4% de interés
al año. Estos ahorros debido a intereses, que no se cobran hasta finales de año, se te añaden al
balance final de tu cuenta de ahorros. Escribir un programa que comience leyendo la cantidad de
dinero depositada en la cuenta de ahorros, introducida por el usuario. Después el programa debe
calcular y mostrar por pantalla la cantidad de ahorros tras el primer, segundo y tercer años.*/
public class T2RepasoEj2 {
    public static void main(String args[]) {
        System.out.println("Introduzca una cantidad de dinero a depositar:");
        double dinero = new Scanner(System.in).nextDouble();
        int porcentaje = 4;
        double dinero1año = dinero+((dinero/100)*porcentaje);
        double dinero2año = dinero1año+((dinero1año/100)*porcentaje);
        double dinero3año = dinero2año+((dinero2año/100)*porcentaje);
        System.out.println("El primer año"+dinero1año);
        System.out.println("El primer año"+dinero2año);
        System.out.println("El primer año"+dinero3año);
    }
}
