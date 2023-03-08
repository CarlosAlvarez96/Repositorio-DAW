/*Ejercicio 25 : Consulta el pdf de la “Librería Estándar de Java” y busca la clase Scanner. Realiza 
un programa que abra el archivo “d:/frase.txt” que has creado en el ejercicio anterior y nos 
muestre por pantalla las dos frases que hay guardadas en él. */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class T2EJERCICIO25 {

    public static void main(String args[]) {
       
        try {
            File a = new File("H:/Mi unidad/PROGRAMACIÓN/docs/frase.txt");
            Scanner txt = new Scanner(a);
            System.out.println(txt.nextLine());
            System.out.println(txt.nextLine());
            txt.close();
        } catch (FileNotFoundException F) {
            System.out.println("Error 404");
        }
    }
}
