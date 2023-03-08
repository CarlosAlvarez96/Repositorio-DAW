
import java.util.Scanner;

/*
Ejercicio 6: Realiza un programa que pregunte al usuario "¿Eres mayor de edad (si/no)?". Si el 
usuario escribe "Si", el ordenador mostrará un mensaje "El usuario es mayor de edad". Si el 
usuario escribe "No", el ordenador mostrará "El usuario es menor de edad". Si el usuario 
escribe cualquier otra cosa, el ordenador mostrará "No te entiendo" y volverá a hacer la 
pregunta hasta que el usuario escriba lo correcto.
 */
public class T3EJERCICIO6 {

    public static void main(String args[]) {
        System.out.println("¿Eres mayor de edad?(si/no)");
        String mayorEdad = new Scanner(System.in).nextLine();
        switch (mayorEdad) {
            case "Si","si": {
                System.out.println("El usuario es mayor de edad");
            }
            case "No","no": {
                System.out.println("El usuario es menor de edad");
            }
            default: {
                System.out.println("No te entiendo");
            }

        }
    }
}
