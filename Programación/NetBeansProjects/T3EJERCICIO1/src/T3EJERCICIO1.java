
import java.io.*;
import java.util.Scanner;

/*
Ejercicio 1: Realiza un programa que muestre estas dos opciones al usuario: 
1) Escribir dos frases en un archivo 
2) Leer dos frases del archivo 
Se hará un bloque switch-case que analice la opción elegida por el usuario. Si pulsa 1, se 
creará un archivo llamado “frases.txt” con dos frases (las que tú quieras) en él. Si pulsa 2, 
se leerá el archivo “frases.txt” y se mostrarán en pantalla las dos frases que contiene. 

 */
public class T3EJERCICIO1 {

    public static void main(String args[]) {
        System.out.println("Elige escribir 2 frases en un archivo(escribir ->1) o leer 2 frases en un archivo(escribir ->2");
        String var = new Scanner(System.in).nextLine();
        switch (var) {
            case "1":
                try {
                File frases = new File("H:/Mi unidad/PROGRAMACIÓN/docs/frases.txt");
                frases.println("Esta es la frase 1" + "Esta es la frase 2");
            } catch (Exception e) {
                System.out.println("Error");

            }
            break;
            case "2":
                try {
                File frases2 = new File("H:/Mi unidad/PROGRAMACIÓN/frases.txt");
                BufferedReader txt = new BufferedReader(new FileReader(frases2));
            } catch (Exception e) {
                System.out.println("Error");
            }
        }
    }
}
