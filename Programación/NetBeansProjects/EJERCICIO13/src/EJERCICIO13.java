import java.util.*;
public class EJERCICIO13 {
    public static void main(String args[]) {
        System.out.println("Introduzca el número de horas");
        int horas= new Scanner(System.in).nextInt();
        System.out.println("Introduzca el número de minutos");
        int min= new Scanner(System.in).nextInt();
        System.out.println("Introduzca el número de segundos");
        int secs= new Scanner(System.in).nextInt();
        int totalsegundos= ((horas*3600)+(min*60)+secs);
        System.out.println("El total de segundos es: "+totalsegundos+" segundos");
        
    }
}
