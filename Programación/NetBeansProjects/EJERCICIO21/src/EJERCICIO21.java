import java.util.*;
public class EJERCICIO21 {
    public static void main(String args[]) {
        int preguntas= 8;
        int problemas= 4;
        int preguntasCorrectas= 6;
        int problemasCorrectos=1;
        double notasobre100= (40/preguntas*preguntasCorrectas)+(60/problemas*problemasCorrectos);
        System.out.println("La nota es: "+ (notasobre100/10));
    }
}
