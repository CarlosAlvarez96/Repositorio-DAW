import java.util.*;
public class EJERCICIO15 {
    public static void main(String args[]) {
        System.out.println("Introduzca un número para pasar a Farenheit: ");
        int gradosCentigrados= new Scanner(System.in).nextInt();
        System.out.println("Son: "+((gradosCentigrados * 9 / 5) + 32)+" grados Farenheit");
    }
}
