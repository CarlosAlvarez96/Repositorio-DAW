
import java.util.Scanner;

/*
Ejercicio 3: Realiza un programa que pregunte al usuario una palabra y cree una variable de 
tipo char llamada letraCentral inicializada con cualquier valor. A continuación, se usará el 
switch mejorado para hacer lo siguiente: 
 Si la palabra tiene un número impar de letras, se guardará en letraCentral el carácter 
de su posición central. 
 Si la palabra tiene un número par de letras, el programa preguntará al usuario: “hay 
dos posibles letras centrales. ¿Quieres la de la izquierda (i) o la de la derecha (d)?” Si el 
usuario elige “i” o “I”, se guardará en letraCentral la letra cuya posición pega a la 
izquierda del centro de la palabra. Si se elige “d” o “D” se guardará en letraCentral la 
letra cuya posición pega a la derecha del centro de la palabra. Ejemplos: 
o Si elegimos “ADIOS”, como hay cantidad impar de letras, guardamos en 
letraCentral la letra I 
o Si elegimos “HOLA”, hay dos posibles letras centrales, que serían la O (la que 
pega a la izquierda) y la L (la que pega a la derecha)
 */
public class T3EJERCICIO3 {

    public static void main(String args[]) {
        System.out.println("Escriba una palabra:");
        String palabra = new Scanner(System.in).nextLine();
        char letraCentral = 'c';
        int cantCar = palabra.length();
        int par = cantCar % 2;
        int Central = (cantCar+1) / 2;
        int centralDer = Central;
        int centralIzq = cantCar/2;
        System.out.println(par);
        switch (cantCar%2) {
            case 1 -> {
                char letraCentral = palabra.charAt(Central);
            }
            case 0 -> {
                System.out.println("¿Quieres la letra de la izquierda(i) o de la derecha(d)");
                String opcion = new Scanner(System.in).nextLine();
                switch (opcion) {
                    case 'd','D' -> letraCentral = palabra.charAt(centralDer);
                    case 'i','I' -> letraCentral = palabra.charAt(centralIzq);
                }
            }
        }
        System.out.println(letraCentral);
    }
}
