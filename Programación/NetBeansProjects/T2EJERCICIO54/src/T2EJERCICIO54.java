/*Ejercicio 54 : Haz un programa que haga esto: 
a) Crea una lista de 10 palabras (las que tú quieras) 
b) Muestra por pantalla la salida del método toString de la lista 
c) Busca en la clase Collections un método que nos ordene la lista y llámalo. 
d) Una vez ordenada, muestra por pantalla la salida del método toString de la lista */
import java.util.*;
public class T2EJERCICIO54 {
    public static void main(String args[]) {
        List<String> marcas = new ArrayList<String>();
        marcas.add("BMW");
        marcas.add("VW");
        marcas.add("Skoda");
        marcas.add("Mercedes");
        marcas.add("Toyota");
        marcas.add("Subaru");
        marcas.add("Honda");
        marcas.add("Lamborgini");
        marcas.add("Nissan");
        marcas.add("Ferrari");
        String tostring = marcas.toString();
        System.out.println(tostring);
        Collections.sort(marcas);
        String tostring2 = marcas.toString();
        System.out.println(tostring2);
    }
}
