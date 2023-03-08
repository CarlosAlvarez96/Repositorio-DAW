import java.util.Scanner;
public class NewMain {
    public static void main(String[]args) {
        System.out.println("Dime tu número de faltas");
        int faltas = new Scanner(System.in).nextInt();
        if(faltas>=15){
            // este caso es cuando hay mas de 15 faltas
            System.out.println("Tu nota es: 0");
        }else{
                //este caso es si hay menos de 15 faltas, examen suspenso
                System.out.println("Introduce la nota de tu examen");
                double nota = new Scanner(System.in).nextDouble();
                if(nota<5){
                    System.out.println("Tu nota es: " +nota);
                }else{
                    //menos de 15 faltas y examen aprobado
                    double notaFinal = nota - (faltas/3);
                    // nota = nota - (faltas/3)
                    // nota -= faltas/3; (recomendable)
                    System.out.println(notaFinal);
                    
                }
        }
        
    }
}

