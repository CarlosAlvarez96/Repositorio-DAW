
import java.util.Scanner;

/*
Ejercicio 6: Los tramos impositivos para la declaración de la renta en un determinado país son los
siguientes:
Realiza un programa que pregunte al usuario su renta anual y muestre por pantalla el tipo
impositivo que le corresponde.
 */
public class T2RepasoEj6 {
    public static void main(String args[]) {
        System.out.println("¿Cuál es tu renta anual?");
        int renta = new Scanner(System.in).nextInt();
        if(renta<10000 && renta>=0){
            System.out.println("Su tipo impositivo es de 5%");
        }else if(renta<20000 && renta>=10000){
            System.out.println("Su tipo impositivo es de 15%");
        }else if(renta<35000 && renta>=20000){
            System.out.println("Su tipo impositivo es de 20%");
        }else if(renta<60000 && renta>=35000){
            System.out.println("Su tipo impositivo es de 30%");
        }else if(renta>=60000){
            System.out.println("Su tipo impositivo es de 45%");
        }else{
            System.out.println("Error, su renta no puede ser negativa");
        }
    }
}
