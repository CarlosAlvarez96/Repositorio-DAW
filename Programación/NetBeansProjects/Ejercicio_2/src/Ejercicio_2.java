import java.util.*;
public class Ejercicio_2{
    public static void main(String args[]) {
        System.out.println("pon tu nota");
        double nota = new Scanner(System.in).nextDouble();

            /*
                <5 -> insuficiente
                5 <= nota <6 -> suficiente
                6 <= nota <7 -> bien
                7 <= nota <9 -> notable
                >=9 sobresaliente
            */
        if(nota < 5){
            System.out.println("Insuficiente");
        }else if (nota >=5 && nota <6){
            System.out.println("Suficiente");
        }else if (nota >=6 && nota<7){
            System.out.println("Bien");
    }else if (nota >=7 && nota <8){
            System.out.println("Notable");
    }else if (nota >=8 && nota <10){
            System.out.println("Sobresaliente");
    }else {
            System.out.println("Introduce un número válido");
    }
    }
}
