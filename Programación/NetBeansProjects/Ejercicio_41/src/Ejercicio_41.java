import java.util.*;
public class Ejercicio_41 {

    public static void main(String args[]) {
            System.out.println("Inserte un número entre 12 y 56");
            int numero = new Scanner(System.in).nextInt();
            if (numero<=56 || numero=>12){
            System.out.println("Es correcto");
            }else {
            System.out.println("No es correcto");
            }
    }       
    
}