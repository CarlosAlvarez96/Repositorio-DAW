import java.util.*;
public class Ejercicio_45{
    public static void main(String args[]) {
        System.out.println("Introduzca los datos de A");
        int A=new Scanner(System.in).nextInt();
        System.out.println("Introduzca los datos de B");
        int B=new Scanner(System.in).nextInt();
        System.out.println("Introduzca los datos de C");
        int C=new Scanner(System.in).nextInt();
        if (A==B+C){
            System.out.println("El triángunlo es rectángulo");
        }else if (A*A<B*B+C*C){
            System.out.println("El triángulo es Acutángulo");
        }else if (A*A>B*B+C*C){
            System.out.println("El triángulo es obtusángulo");
        }
    }
}
