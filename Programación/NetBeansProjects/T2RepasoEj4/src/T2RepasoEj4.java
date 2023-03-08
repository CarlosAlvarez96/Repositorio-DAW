
import java.util.Scanner;

/*
Ejercicio 4: Escribir un programa que pregunte por consola el precio de un producto en euros con
dos decimales y muestre por pantalla el número de euros y el número de céntimos del precio
introducido.
 */
public class T2RepasoEj4 {
    public static void main(String args[]) {
        System.out.println("Introduzca el número de euros con 2 decimales:");
        double dinero = new Scanner(System.in).nextDouble();
        int euros = (int)dinero;
        double centimos = (dinero-euros);
        System.out.println( euros);
        System.out.println((int)((centimos*100)+1));
    }
}
