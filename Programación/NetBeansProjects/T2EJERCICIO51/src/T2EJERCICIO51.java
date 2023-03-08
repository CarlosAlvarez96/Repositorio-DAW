


/*Ejercicio 51 : Consulta la documentación de la interfaz Set<T> y la clase HashSet<T> y haz un 
programa que las use para crear un conjunto de Strings llamado “mensajes” y haga esto: 
a) Rellene el conjunto con las palabras: silla, mesa, niño, mesa, casa, silla, lápiz 
b) Muestre por pantalla el tamaño de la lista 
c) Llame al método toString de la lista y muestre por pantalla lo que produce*/
import java.util.*;
public class T2EJERCICIO51 {
    public static void main(String args[]) {
        Set<String> mensajes = new HashSet<String>();
        mensajes.add("silla");
        mensajes.add("mesa");
        mensajes.add("niño");
        mensajes.add("mesa");
        mensajes.add("casa");
        mensajes.add("silla");
        mensajes.add("lapiz");
        //Éste método no admite elementos duplcados, no añadirá mesa ni silla 2 veces
        int tamaño = mensajes.size();
        System.out.println("La lista tiene "+tamaño+" palabras");
        String tostring = mensajes.toString();
        System.out.println(tostring);
    }
}
