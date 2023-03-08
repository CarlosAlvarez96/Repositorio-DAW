
import java.util.Scanner;

/*
Ejercicio 29: Un profesor hace diez exámenes y calcula la nota de la asignatura haciendo la 
nota media, pero si alguna de las notas es suspenso, entonces la calificación de la asignatura es 
suspenso. Realiza un programa que pida una por una las notas y muestre al final la nota de la 
asignatura. El programa deberá detenerse si alguno de los exámenes está suspenso. 
 */
public class T3EJERCICIO29 {

    public static void main(String args[]) {

        int nota = 14;
        double total = 0;

        for (int i = 0; nota >= 5 && i < 10; i++) {
            System.out.println("Introduzca una nota");
            nota = new Scanner(System.in).nextInt();
            total += nota;
            if (nota < 5) {
                System.out.println("Suspenso");
            } else {
                System.out.println("La media es" + total / 10);
            }
        }
    }
}
