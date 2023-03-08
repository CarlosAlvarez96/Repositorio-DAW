
import java.util.Scanner;

/*
Ejercicio 7: Según el reglamento de la federación de caza, un cazador no puede cazar más 
piezas de las que se permiten en un día. Queremos hacer un programa que nos lleve la cuenta 
de piezas cazadas e indique cuando se ha excedido el límite. Para ello primero se leerá por 
teclado el límite del día y a continuación los valores de las piezas cazadas en el orden que se 
obtienen. El programa imprimirá un mensaje en el momento en que el límite haya sido 
excedido. Después de que cada pieza ha sido registrada, el programa mostrará el número total 
de piezas que se llevan hasta ese momento cazadas. Ejemplo: 
 */
public class T3EJERCICIO7 {
    public static void main(String args[]) {
        int contadorRep = 0;
        /*boolean repetir=true;
        while(repetir){
            System.out.println("Introduzca el número de piezas cazadas");
            int piezas = new Scanner(System.in).nextInt();
            contadorRep = piezas;
            System.out.println("Usted lleva "+piezas+" piezas cazadas.");
            if(contadorRep>=30){
                repetir=false;
            }
        }*/
        while(contadorRep<=30){
            System.out.println("Introduzca el número de piezas cazadas");
            int piezas = new Scanner(System.in).nextInt();
           
            System.out.println("Usted lleva "+piezas+" piezas cazadas.");
             contadorRep = piezas;
        }
    }
}
