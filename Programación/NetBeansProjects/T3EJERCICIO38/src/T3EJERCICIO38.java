
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Ejercicio 38: Realiza un programa que pregunte al usuario una cadena de caracteres con su 
NIF. El programa deberá analizarla y decir si se trata de un NIF correcto o incorrecto. Un NIF 
correcto está formado por 8 dígitos y una letra. Los dígitos deben estar comprendidos entre 0 
y 9 y la letra debe calcularse tal y como se indica en un ejercicio del tema 1.
 */
public class T3EJERCICIO38 {

    public static void main(String args[]) {
        System.out.println("Introduzca el número de su NIF");
        String nif = new Scanner(System.in).nextLine();
        System.out.println("Introduzca la letra de su NIF");
        String letra = new Scanner(System.in).nextLine();
        String [] letras= {"T","R","W","A","G","M","Y","F","T","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E","T"};
        int n = Integer.parseInt(nif);
        int resultado = n / 23;
        for (int i = 0; i < 24; i++) {
            if(letra==letras[i]){
                System.out.println("El NIF es correcto");
            }
        }
    }

}
