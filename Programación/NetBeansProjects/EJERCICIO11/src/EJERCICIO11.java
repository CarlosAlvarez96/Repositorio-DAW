import java.util.*;
public class EJERCICIO11 {
    public static void main(String[]args){
        System.out.println("Introduzca su nombre:");
        String nombre= new Scanner(System.in).nextLine();
        System.out.println("Introduzca su primer apellido:");
        String apellido1= new Scanner(System.in).nextLine();
        System.out.println("Introduzca su segundo apellido:");
        String apellido2= new Scanner(System.in).nextLine();
        System.out.println("Su nombre y apellidos son: "+ nombre+" " +apellido1+" "+apellido2);
    }
}