
import java.util.*;

public class T2EJERCICIO17 {

    public static void main(String args[]) {
        System.out.println("Introduzca su nombre: ");
        String nombre = new Scanner(System.in).nextLine();
        System.out.println("Introduzca su dominio: ");
        String dominio = new Scanner(System.in).nextLine();
        String com = ".com";
        String es = ".es";
        boolean contienecom = dominio.contains(com);
        boolean contienees = dominio.contains(es);
        if (contienecom || contienees) {
            String correo = nombre +"@"+ dominio;
            System.out.println("El correo es: "+ correo);
        } else {
            System.out.println("El dominio es incorrecto");
        }
    }
}
