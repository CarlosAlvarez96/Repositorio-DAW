/*
Ejercicio 50 : Consulta la documentación de la interfaz List<T> y la clase ArrayList<T> y haz un 
programa que las use para crear una lista de Strings llamada “mensajes” y haga estas acciones: 
a) Rellene la lista con 5 palabras (las que tú quieras) 
b) Muestre por pantalla el tamaño de la lista 
c) Muestre por pantalla la palabra de la posición 3 de la lista. 
d) Llame al método toString de la lista y muestre por pantalla lo que produce 
e) Elimine el primer dato de la lista 
f) Muestre el tamaño de la lista 
g) Muestre por pantalla la palabra de la posición 3 de la lista 
h) Llame al método toString de la lista y muestre por pantalla lo que produce 
 */
import java.util.*;
public class T2EJERCICIO50 {
    public static void main(String args[]) {
        List<String> mensajes = new ArrayList<String>();
        mensajes.add("mapache");
        mensajes.add("perro");
        mensajes.add("gato");
        mensajes.add("zorro");
        mensajes.add("oso");
        int total = mensajes.size();
        System.out.println("El tamaño de la lista es: "+total+" palabras");
        String tercerapos = mensajes.get(2); 
        System.out.println("La palabra de la tercera posición es: "+tercerapos);
        String tostring = mensajes.toString();
        System.out.println(tostring);//muestra la lista como un conjunto de strings entre corchetes
        mensajes.remove(0);
        int total2 = mensajes.size();
        System.out.println("El tamaño es ahora de: "+total2+" palabras.");
        String tercerapos2 = mensajes.get(2); 
        System.out.println("La palabra de la nueva tercera posición es: "+tercerapos2);
        String tostring2 = mensajes.toString();
        System.out.println(tostring2);
    }
}
