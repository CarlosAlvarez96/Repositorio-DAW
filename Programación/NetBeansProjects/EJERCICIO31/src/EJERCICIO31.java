import java.util.*;
public class EJERCICIO31 {
    public static void main(String args[]) {
        double horasLDM=128;
        double horasRR= 192;
        double horasH= 96;
        System.out.println("La cantidad máxima de horas de lenguaje de marcas es: "+ ((horasLDM/100)*20 ) );
        System.out.println("La cantidad máxima de horas de redes es: "+( (horasRR/100)*20 ) );
        System.out.println("La cantidad máxima de horas de hardware es: "+( (horasH/100)*20 ) );  
        System.out.println("¿Cuantas faltas tiene el alumno en redes?");
        double faltas= new Scanner(System.in).nextDouble();
        if(faltas<=((horasRR/100)*20 )){
            System.out.println("No supera la cantidad de faltas");
        }else{
            System.out.println("Supera la cantidad de horas");
        }
        
        
    }
    
}
