
import java.lang.*;
import java.util.Scanner;

public class ExamenT3Ejercicio4 {

    public static void main(String args[]) {
        System.out.println("Introduzca un número");
        String s = new Scanner(System.in).nextLine();
        int contador = 0;
        for (int i = 0; i < (int) s.length() / 2; i++) {
            char a = s.charAt(i);
            boolean b = Character.isDigit(a);
            if (b) {
                if (a == s.charAt(s.length()  - a)) {  //se que no puedo comparar un char con un número pero no sabía hacer esta parte
                    contador++;
                }
            } else {
                System.out.println("Tienes que introducir un número válido");
            }
            if (contador == (int) s.length() / 2) {
                System.out.println("El número es capicúa");
            }
        }
    }
}
