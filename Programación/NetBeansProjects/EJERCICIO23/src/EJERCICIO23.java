import java.util.*;
public class EJERCICIO23 {
    public static void main(String args[]) {
        System.out.println("Introduzca la nota de su primer examen: ");
        int nota1= new Scanner(System.in).nextInt();
        System.out.println("Introduzca la nota de su segundo examen: ");
        int nota2= new Scanner(System.in).nextInt();
        System.out.println("Introduzca la nota de su tercer examen: ");
        int nota3= new Scanner(System.in).nextInt();
        double notaMedia= (nota1+nota2+nota3)/3;
        if (notaMedia>=5){
            System.out.println("Media aprobada!");
        }else{
            System.out.println("Media suspensa xd");
        }
    }
}
