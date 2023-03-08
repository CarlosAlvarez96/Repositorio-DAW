import java.util.*;
public class Ejercicio_39 {


    public static void main(String args[]) {
      System.out.println("Escribe dos numeros enteros: ");
      int primernumero = new Scanner(System.in).nextInt();
      int segundonumero = new Scanner(System.in).nextInt();
      //He tenido que copiar las lineas desde new Scanner hasta el final, escribiendolas a mano no reconocia el nextInt.
      if(primernumero>=segundonumero){
          System.out.println(primernumero + " es mayor o igual que " + segundonumero);
      }else{
          System.out.println(primernumero + " es menor que " + segundonumero);
      }
      
      
      
    }
}
