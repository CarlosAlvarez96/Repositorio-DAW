import java.util.*;
public class EJERCICIO16 {
    public static void main(String args[]) {
        System.out.println("Introduzca el precio de el padrino");
        double elpadrino = new Scanner(System.in).nextDouble();
        System.out.println("Introduzca el precio de odisea 2001");
        double odisea = new Scanner(System.in).nextDouble();
        System.out.println("Se necesitan "+ (elpadrino*2)+" euros para alquilar el padrino dos dias");
        System.out.println("Se necesitan "+(odisea*2)+" euros par alquilar odisea 2001 dos dias");
        boolean comprable= (elpadrino*2)+(odisea*2)<=5;
        System.out.println("Con un billete de 5 euros: "+ comprable);
    }
}
