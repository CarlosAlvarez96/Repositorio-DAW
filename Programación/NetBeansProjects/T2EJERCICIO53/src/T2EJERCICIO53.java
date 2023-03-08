/*Ejercicio 53 : Repite los apartados a,b,c y d del ejercicio anterior pero rellenando el 
Map<String,Color> con un TreeMap<String,Color>. ¿Notas alguna diferencia en la salida del 
programa?*/
import java.util.*;
import java.awt.*;

public class T2EJERCICIO53 {

    public static void main(String args[]) {
        Map<String, Color> matriculas = new TreeMap<String, Color>();
        matriculas.put("135A5BC", Color.red);
        matriculas.put("98525KWX", Color.yellow);
        matriculas.put("17632MSE", Color.green);
        matriculas.put("85321ABC", Color.yellow);
        matriculas.size();
        String tostring = matriculas.toString();
        System.out.println(tostring);
        System.out.println("Introduzca una matrícula:");
        String matricula = new Scanner(System.in).nextLine();
        if (matriculas.containsKey(matricula)) {
            Color b = matriculas.get(matricula);
            System.out.println(b);
        } else {
            System.out.println("No existe");
        }
        //cambia el orden con respecto al ejercicio 52
    }
}
