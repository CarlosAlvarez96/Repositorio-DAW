
import java.util.Scanner;

/*Ejercicio 23: Realiza un programa que cree la lista de números del ejercicio anterior. A 
continuación, el programa preguntará al usuario: “Escribe un número” y nos mostrará en 
pantalla cuántas veces aparece el número en la lista y si el número está o no en la lista. 
 */
public class T3EJERCICIO23 {

    public static void main(String args[]) {
        int[] lista = {2, 9, 4, 5, 6, 1, 2, 3, 45, 2, 1, 2, 65, 3, 2, 6, 1, 2, 3, 5, 2, 2, 6, 67, 11, 67, 3, 2, 1, 7, 8, 5, 3, 27, 8, 93, 1, 6};
        int acumulador = 0;
        System.out.println("Introduzca un número entero");
        int numero = new Scanner(System.in).nextInt();
        for (int i = 0; i < lista.length; i++) {
            if (numero == lista[i]) {
                acumulador++;
            }
        }
        if (acumulador == 0) {
            System.out.println("El número no está");
        } else {
            System.out.println("El número está y aparece " + acumulador + " veces");
        }
    }
}
