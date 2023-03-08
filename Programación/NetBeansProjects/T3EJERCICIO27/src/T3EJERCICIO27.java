
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Ejercicio 27 : Haz un programa que pida 6 palabras al usuario y las guarde en un List<String>. El 
programa deberá recorrer dicha lista y mostrará por pantalla las que contienen la letra “a”. 
 */
public class T3EJERCICIO27 {

    public static void main(String args[]) {
        List<String> lista = new ArrayList<>();
        List<String> listaConA = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            System.out.println("Introduzca una palabra");
            String palabra = new Scanner(System.in).nextLine();
            lista.add(palabra);
            if (palabra.contains("a") || palabra.contains("A")) {
                listaConA.add(palabra);
            }
        }
        System.out.println(listaConA.toString());
    }
}
