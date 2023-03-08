import java.util.*;
public class Asignacion_condicional {
    public static void main(String args[]) {
        System.out.println("Introduzca la edad");
        int edad=new Scanner(System.in).nextInt();
        if (edad>=0){
                int precioEntrada= edad<18? 3 :
                                             edad<30? 5 :
                                             edad<60? 7 : 4;
      }
    }
    
