
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Ejercicio 47: Supongamos que un diccionario español – inglés tiene las palabras de la tabla. 
Realiza tres programas que pregunten cada uno por teclado al usuario una palabra en español 
y nos salga su palabra traducida al inglés, de esta forma: 
a) Usando dos arrays unidimensionales (listas) para guardar los datos de la tabla 
b) Usando un array bidimensional (tabla) para guardar los datos de la tabla 
c) Usando un Map<String,String> para guardar los datos de la tabla 
 */
public class T3EJERCICIO47 {

    public static void main(String args[]) {
        //A)
        /*
        String[] esp = {"hola", "casa", "caballo", "hacha", "manzana", "ventana", "tortuga", "raton", "mesa"};
        String[] ing = {"hello", "house", "horse", "axe", "apple", "window", "turtle", "mouse", "table"};

        System.out.println("introduzca una palabra");
        String palabra = new Scanner(System.in).nextLine();
        for (int i = 0; i < esp.length; i++) {
            if (esp[i].contains(palabra)) {
                System.out.println(ing[i]);
            }
        }*/
        //B)
        /*
        String[][] tabla = {
            {"hola", "casa", "caballo", "hacha", "manzana", "ventana", "tortuga", "raton", "mesa"},
            {"hello", "house", "horse", "axe", "apple", "window", "turtle", "mouse", "table"}
        };
        System.out.println("introduzca una palabra");
        String palabra = new Scanner(System.in).nextLine();
        for(int i=0; i<9;i++){
            if(palabra.contains(tabla[0][i])){
            System.out.println(tabla[1][i]);
            }
        }
        */
        
        //C)
        Map<String,String> map= new HashMap<>();
        map.put("hola", "hello");
        map.put("casa", "house");
        map.put("caballo", "horse");
        map.put("hacha", "axe");
        map.put("manzana", "apple");
        map.put("ventana", "window");
        map.put("tortuga", "turtle");
        map.put("raton", "mouse");
        map.put("mesa", "table");
        System.out.println("Introduzca una palabra");
        String palabra= new Scanner(System.in).nextLine();
        String traduccion = map.get(palabra);
        System.out.println(traduccion);
        
        
    }
}

