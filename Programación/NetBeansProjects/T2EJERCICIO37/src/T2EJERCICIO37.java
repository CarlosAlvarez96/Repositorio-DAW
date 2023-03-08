/*Ejercicio 37 : Consulta el pdf de la “Librería Estándar de Java” y busca la clase Integer, que está 
en la hoja de “clases envoltorio”. Haz un programa que pregunte al usuario por teclado un 
número. El programa mostrará ese número escrito en binario y hexadecimal. */
import java.util.*;

public class T2EJERCICIO37 {

    public static void main(String args[]) {
        System.out.println("Introduzca un número entero: ");
        int v = new Scanner(System.in).nextInt();
        String binario = Integer.toBinaryString(v);
        String hexadecimal = Integer.toHexString(v);
        System.out.println("Su número es: " + binario + " en binario y es: " + hexadecimal + " en hexadecimal.");
    }
}
