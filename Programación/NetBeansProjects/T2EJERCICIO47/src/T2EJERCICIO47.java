
import java.io.File;
import java.util.Scanner;
import java.awt.*;
import java.io.IOException;

/*
Ejercicio 47 : Consulta el pdf de la “Librería Estándar de Java” y busca la clase Desktop. Haz un 
programa que pregunte al usuario la ruta de un archivo. El programa abrirá dicho archivo 
usando para ello el programa que esté configurado en el sistema operativo.
 */
public class T2EJERCICIO47 {

    public static void main(String args[]) {
        System.out.println("Escriba una ruta de un archivo:");
        String ruta = new Scanner(System.in).nextLine();
        File archivo = new File(ruta);
        try{
        Desktop.getDesktop().open(archivo);
        }catch(IOException c){ 
            System.out.println(c);
        }
    }
}
