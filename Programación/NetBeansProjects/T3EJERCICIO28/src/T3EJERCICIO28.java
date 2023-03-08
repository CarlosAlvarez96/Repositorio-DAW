
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Ejercicio 28 : Haz un programa que pida 6 palabras al usuario y las guarde en un List<String>. El 
programa deberá mostrar por pantalla las palabras únicas (o sea, las palabras repetidas no se 
mostrarán). 
 */
public class T3EJERCICIO28 {

    public static void main(String args[]) {
        List<String> listaPalabras = new ArrayList<>();
        List<String> listaPalabrasUnicas = new ArrayList<>();
        for (int i = 0; i < 6; i++) {

            System.out.println("Introduzca una palabra");
            String palabra = new Scanner(System.in).nextLine();
            
            if (listaPalabras.contains(palabra)) {
                listaPalabras.add(palabra);
            } else {
                 listaPalabrasUnicas.add(palabra);
                 listaPalabras.add(palabra);
            }
        }
        System.out.println(listaPalabrasUnicas.toString());
    }
}
