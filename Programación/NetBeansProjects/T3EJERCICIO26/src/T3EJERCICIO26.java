
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Ejercicio 26: Consulta la documentación del “Java Collection Framework” para hacer este 
programa: 
a) Se comenzará creando un objeto List<String> y lo rellenará con un objeto 
ArrayList<String> (se usará abstracción para ello como se vio en el tema 2). 
b) El programa mostrará este menú de opciones, que se repetirá hasta que el usuario 
pulse la opción de salir. 
1. Añadir mensaje a la lista 
2. Consultar el número de mensajes de la lista 
3. Consultar mensaje 
4. Comprobar mensaje 
5. Consultar todos los mensajes 
6. Borrar toda la lista 
7. Salir 
c) Lo que hay que hacer en cada opción es: 
1. Pide al usuario que introduzca una frase y la añadirá al List<String> 
2. Muestra en pantalla el número de elementos que hay en el List<String> 
3. Cuando se selecciona, pueden pasar dos cosas 
1. Si la lista está vacía, se mostrará “No hay mensajes” y volverá al menú. 
2. Si la lista no está vacía, el programa preguntará el número del mensaje 
que se desea consultar y el usuario deberá introducir un número entre 
0 y la última posición válida de la lista. Si se introduce un número fuera 
de ese rango, el programa avisará de ello. En caso contrario, se 
mostrará el mensaje indicado. 
4. Pedirá al usuario que escriba un mensaje y el programa mostrará si el mensaje 
está o no en la lista. En caso de que si esté, se mostrará también su número de 
posición. 
5. Mostrará todos los mensajes de la lista, cada uno en una línea con el formato 
“El mensaje de la posición … es …” 
6. Borra todos los mensajes de la lista 

 */
public class T3EJERCICIO26 {

    public static void main(String args[]) {
        List<String> lista = new ArrayList<>();
        int opcion = 0;
        boolean repetir = true;
        while (repetir) {
            System.out.println("1. Añadir mensaje a la lista \n"
                    + "2. Consultar el número de mensajes de la lista \n"
                    + "3. Consultar mensaje \n"
                    + "4. Comprobar mensaje \n"
                    + "5. Consultar todos los mensajes \n"
                    + "6. Borrar toda la lista \n"
                    + "7. Salir ");
            opcion = new Scanner(System.in).nextInt();
            if (opcion == 1) {
                System.out.println("Introduzca un mensaje");
                String m = new Scanner(System.in).nextLine();
                lista.add(m);
            } else if (opcion == 2) {
                System.out.println(lista.size());
            } else if (opcion == 3) {
                System.out.println("Introduzca una posición de mensaje");
                int pos = new Scanner(System.in).nextInt();
                System.out.println(lista.get(pos));
            } else if (opcion == 4) {
                System.out.println("Introduzca un mensaje");
                String palabra = new Scanner(System.in).nextLine();
                boolean existe=lista.contains(palabra);
                if(existe){
                    System.out.println("El elemento está en la lista");
                }else{
                    System.out.println("El elemento no está en la lista");
                }
            } else if (opcion == 5) {
                for (int x = 0; x < lista.size(); x++) {
                    System.out.println(lista.get(x));
                }
            } else if (opcion == 6) {
                lista.clear();
            } else if (opcion == 7) {
                repetir = false;
            } else {
                System.out.println("Número no válido");
            }
        }
    }
}
