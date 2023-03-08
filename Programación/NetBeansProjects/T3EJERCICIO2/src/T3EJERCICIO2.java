
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/*
Ejercicio 2: Repite el ejercicio 1 utilizando un switch mejorado. 

 */
public class T3EJERCICIO2 {

    public static void main(String args[]) {
        System.out.println("Elige escribir 2 frases en un archivo(escribir ->1) o leer 2 frases en un archivo(escribir ->2");
        String var = new Scanner(System.in).nextLine();
        switch (var) {
            case "1" -> {
                try {
                    File frases = new File("H:/Mi unidad/PROGRAMACIÓN/docs/frases.txt");
                    frases.println("Esta es la frase 1" + "Esta es la frase 2");
                } catch (Exception e) {
                    System.out.println("Error");
                }

            
        
    

case "2" -> {
                 try {
                File frases2 = new File("H:/Mi unidad/PROGRAMACIÓN/frases.txt");
                BufferedReader txt = new BufferedReader(new FileReader(frases2));
            } catch (Exception e) {
                System.out.println("Error");
                }
                }
                default -> System.out.println("Error");
            }
        }
    }
}
