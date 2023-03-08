
import java.util.*;
import java.io.*;

public class T2EJERCICIO19 {

    public static void main(String args[]) {
        System.out.println("introduzca la ruta de un archivo: ");
        String ruta = new Scanner(System.in).nextLine();
        File archivo = new File(ruta);
        System.out.println(archivo.getTotalSpace());
    }
}
