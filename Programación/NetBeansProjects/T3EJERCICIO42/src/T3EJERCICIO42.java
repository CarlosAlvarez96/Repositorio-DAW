
import java.util.Scanner;

/*
Ejercicio 42: En este ejercicio vas a hacer un programa que pida por teclado al usuario el 
nombre de un día y muestre tu horario de clases de ese día. Sigue estos pasos: 
a) Crea una lista para guardar los nombres de los días de la semana 
b) Crea una lista de String para guardar las horas (por ejemplo “16:00 – 16:55”) 
c) Crea una tabla 5 x 6 con las asignaturas que tienes cada día (cada columna es un día). 
d) Pide por teclado al usuario el nombre de un día 
e) Obtén la posición que tiene el día introducido dentro de la lista del apartado a) 
f) Recorre la columna correspondiente a ese día y muestra las asignaturas, poniendo 
también la hora correspondiente a cada una. 
 */
public class T3EJERCICIO42 {

    public static void main(String args[]) {
        String[] dias = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        String[] horas = {"08:15-09:15", "09:15-10:15", "10:15-11:15", "11:45-12:45", "12:45-13:45", "13:45:14:45"};
        String asignaturas[][] = {
            {"BBDD", "SSII", "FOL", "ED", "BBDD"},
            {"BBDD", "SSII", "FOL", "ED", "BBDD"},
            {"PR", "FOL", "PR", "PR", "LLMM"},
            {"PR", "ED", "PR", "PR", "LLMM"},
            {"SSII", "PR", "BBDD", "LLMM", "SSII"},
            {"SSII", "PR", "BBDD", "LLMM", "SSII"},};
        for (int i = 0; i < asignaturas.length; i++) {
            System.out.println("Introduzca un dia de la semana");
            String dia = new Scanner(System.in).nextLine();
            System.out.println("posición " + dia.indexOf(dia));
            System.out.println(horas[dia]);
            System.out.println(asignatura[i][dia]);
        }

    }
}
