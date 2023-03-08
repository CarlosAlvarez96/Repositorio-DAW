
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Ejercicio 40: Realiza un programa que pida diez notas por teclado y al final muestre su nota 
media. Si alguna nota introducida es incorrecta (negativa o superior a 10) el programa la 
preguntará nuevamente. 
 */
public class T3EJERCICIO40 {
    public static void main(String args[]) {
        List<Integer>lista=new ArrayList<>();
        int suma= 0;
        for(int i=0; i<10;i++){
            System.out.println("Introduzca una nota");
            int nota= new Scanner(System.in).nextInt();
            if(nota>=0 && nota<=10){
                lista.add(nota);
                 suma+=nota;
            }else{
                System.out.println("Nota no válida, prueba otra vez");
                i--;
            }
        }
        System.out.println(suma/10);
    }
}
