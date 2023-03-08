
import java.util.*;

/*
Ejercicio 14 : Realiza un programa que pida una por una, las notas de los alumnos 
comprendidas entre 0 y 10 sin decimales. Cuando el usuario introduzca un -1, se mostrará la 
mayor nota, la menor, y la nota media de todos ellos. 

 */
public class T3EJERCICIO14 {

    public static void main(String args[]) {
        System.out.println("Introduzca las notas de los alumnos entre 0 y 10 sin decimales. Introduzca -1 para terminar");
        int nota = 0;
        int max = 0;
        int min = 0;
        double n = 0;
        List<Integer> l = new ArrayList<>();
        while (nota != -1) {
            nota = new Scanner(System.in).nextInt();
            if (nota >= 1 && nota <= 10) {
                l.add(nota);
                max = Collections.max(l);
                min = Collections.min(l);
                for(int i=0;i<l.size();i++){
                    n+= nota;
                } 
            }
        }
        System.out.println("La media es " + n/l.size() + ". La mayor es " + max + ". La menor es " + min);
    }
}
