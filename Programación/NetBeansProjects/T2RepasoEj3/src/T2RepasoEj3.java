
import java.util.Scanner;

/* Ejercicio 3: Realiza un programa que pida al usuario un numero de cuatro cifras y nos devuelva si
es capicúa o no. Si el usuario introduce un número que no tiene 4 cifras el programa debe avisar del
error.*/
public class T2RepasoEj3 {
    public static void main(String args[]) {
        System.out.println("Introduzca un número de 4 cifras");
        int n = new Scanner(System.in).nextInt();
        int cifra1 = n/1000;
        int cifra2 = (n%1000)/100;
        int cifra3 = (n%100)/10;
        int cifra4 = (n%10);
        if(cifra1==cifra4 && cifra2==cifra3){
            System.out.println("El numero es capicua");
        }else {
            System.out.println("No es capicua");
        }
    }
}
