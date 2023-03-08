
import java.util.Scanner;

/*
Ejercicio 30: Realiza un programa en el que haya una variable llamada "contraseña" iniciada 
con el valor que tú quieras. A continuación el programa pedirá al usuario que introduzca la 
contraseña. El usuario solo tiene 5 intentos para ponerla bien. En caso de que el usuario la 
acierte, el programa dirá "Acceso permitido". Si se agotan los intentos, se mostrará "Acceso 
denegado". En todo momento el programa mostrará el número de intentos restantes.
 */
public class T3EJERCICIO30 {

    public static void main(String args[]) {
        String contraseña = "pepito";
        String contraseñaUser = null;
        int contadorIntentos= 5;
        boolean fallo= true;
        for (int i = 0; i < 5 && fallo; i++) {
            System.out.println("Introduzca la contraseña");
            System.out.println("Quedan "+contadorIntentos+ " intentos restantes");
            contraseñaUser = new Scanner(System.in).nextLine();
            if (contraseña.equals(contraseñaUser)) {
                System.out.println("Acceso permitido");
                fallo=false;
            }else{
                contadorIntentos--;
                fallo=true;
            }
        }
    }
}
