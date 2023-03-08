/*Ejercicio 52 : En este ejercicio vamos a guardar las asociaciones entre la matrícula de un coche 
y el color de dicho coche. Consulta la documentación de la interfaz Map<K,V>, la clase 
HashMap<K,V> y la clase Color del paquete java.awt y haz un programa que haga esto: 
a) Crea un Map<String,Color> y rellenarlo con un HashMap<String,Color> vacío 
b) Añade al objeto creado en el apartado anterior estas asociaciones: 
12535ABC Color rojo
98525KWX Color amarillo
17632MSE Color verde
85321ABC Color amarillo
c) Muestra en pantalla el tamaño del map 
d) Llama al método toString del map y muestra lo que produce por pantalla 
e) Muestra en pantalla el color del coche cuya matrícula se introduce por teclado. En 
caso de introducir una matrícula que no esté en el map, se mostrará el mensaje “No 
existe esa matrícula”*/
import java.util.*;
import java.awt.*;

public class T2EJERCICIO52 {

    public static void main(String args[]) {
        Map<String, Color> matriculas = new HashMap<String, Color>();
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
    }
}
