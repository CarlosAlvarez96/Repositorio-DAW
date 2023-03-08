
import java.util.Scanner;

/*
Ejercicio 5: Los alumnos de un curso se han dividido en dos grupos A y B de acuerdo al sexo y el
nombre. El grupo A está formado por las mujeres con un nombre anterior a la M y los hombres con
un nombre posterior a la N y el grupo B por el resto. Escribir un programa que pregunte al usuario
su nombre y sexo, y muestre por pantalla el grupo que le corresponde.
 */
public class T2RepasoEj5 {
    public static void main(String args[]) {
        System.out.println("Introduzca su nombre");
        String nombre = new Scanner(System.in).nextLine();
        System.out.println("¿Es usted hombre(true) o mujer(false)?");
        boolean sexo = new Scanner(System.in).nextBoolean();
        if(nombre.charAt(0)<'M' && (!sexo) || nombre.charAt(0)>'N' && (sexo)){
            System.out.println("A");
        }else{
            System.out.println("B");
        }
    }
}
