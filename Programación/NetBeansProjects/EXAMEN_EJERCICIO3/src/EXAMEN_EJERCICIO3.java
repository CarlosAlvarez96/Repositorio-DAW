
import java.util.Scanner;
import java.util.StringTokenizer;

public class EXAMEN_EJERCICIO3 {

    public static void main(String args[]) {
        System.out.println("Introduzca un número");
        String numero = new Scanner(System.in).nextLine();
        StringTokenizer st = new StringTokenizer(numero, ".");
        String entera = st.nextToken();
        String decimal = st.nextToken();
        if (decimal.equals(null)) {
            System.out.println("El número es entero");
        } else {
            System.out.println("El número no es entero");
        }
        System.out.println("La parte entera es " + entera);
        if (numero.charAt(0) == '-') {
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es positivo");
        }
        System.out.println("El número tiene " + decimal.length() + " números decimales");

    }
}
