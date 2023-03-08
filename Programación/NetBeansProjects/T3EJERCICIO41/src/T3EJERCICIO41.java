
import java.util.ArrayList;
import java.util.List;

/*
Ejercicio 41: Repite el ejercicio 24 de esta forma: 
a) Crea una lista para guardar los nombres de los alumnos 
b) Crea una tabla para guardar las notas de los alumnos, de tal forma que la fila 0 guarde 
las notas del alumno que ocupe la posición 0 de la lista y así sucesivamente. 
 */
public class T3EJERCICIO41 {

    public static void main(String args[]) {
        String[] nombres = {"Pepe", "Ana", "Juan", "Roberta"};
        int[][] notas = {
            {9, 5, 4, 3},
            {4, 8, 6, 5},
            {2, 5, 10, 2},
            {10, 10, 10, 9}
        };
        double suma = 0;
        double media = 0;
        for (int i = 0; i < 4; i++) {
            System.out.println(nombres[i]);
            for (int j = 0; j < 4; j++) {
                suma += notas[i][j];
                if (j == 3) {
                    media = suma / notas[i].length;
                    System.out.println("La media es " + media);
                    suma = 0;
                }
            }
        }
    }
}
