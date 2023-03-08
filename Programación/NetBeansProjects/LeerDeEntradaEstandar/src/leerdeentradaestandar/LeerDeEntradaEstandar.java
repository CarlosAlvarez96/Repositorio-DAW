
package leerdeentradaestandar;
import java .util.Scanner;

public class LeerDeEntradaEstandar {

    public static void main(String[] args) {
    String nombre = null;
    Scanner lectura = new Scanner(System.in);
    System.out.println("Introduzca su nombre: ");
    nombre = lectura.nextLine( );
    System.out.println("Hola, "+ nombre + " " + "bienvenido");
    }
    
}
