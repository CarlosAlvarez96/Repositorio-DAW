
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Ejercicio 36: Haz un programa que pregunte un número al usuario y nos muestre la lista de 
todos sus divisores. 
 */
public class T3EJERCICIO36 {

    public static void main(String args[]) {
        List<Integer> lista = new ArrayList<>();
        System.out.println("Introduce un número");
        int numero = new Scanner(System.in).nextInt();
        for (int i = 1; i <=numero; i++) {
            if (numero%i== 0) {
                lista.add(i);
            }
        }
        System.out.println(lista);
    }
}
