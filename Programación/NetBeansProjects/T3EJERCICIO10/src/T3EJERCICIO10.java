
import java.util.Scanner;
import java.util.StringTokenizer;

/*
Ejercicio 10: Usa la clase StringTokenizer para hacer un programa que pregunte al usuario 
"Escriba una frase" y nos muestre en una línea diferente cada palabra de la frase y además, el 
número total de palabras encontradas.
 */
public class T3EJERCICIO10 {

    public static void main(String args[]) {
        System.out.println("Escriba una frase");
        String nombre = new Scanner(System.in).nextLine();
        try {
            Boolean b = true;
            StringTokenizer tokens = new StringTokenizer(nombre, "\n", b);
            int contador = tokens.countTokens();
            double[] datos = new double[contador];
            int i = 0;
            while (tokens.hasMoreTokens()) {
                String str = tokens.nextToken();
                datos[i] = Double.valueOf(str);
                System.out.println(datos[i]);
                i++;
            }
        } catch (NullPointerException e) {
            System.out.println(e);
        }

    }
}
