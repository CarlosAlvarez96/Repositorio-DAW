/*Ejercicio 39 : Consulta el pdf de la “Librería Estándar de Java” y busca la clase System. Haz un 
programa que muestre por pantalla información sobre tu ordenador, de la forma que indica la 
siguiente imagen. (Nota: La carpeta de archivos temporales es la variable de entorno TMP). 
 */

import static java.lang.System.*;

public class T2EJERCICIO39 {

    public static void main(String args[]) {

        String nombreSO = getProperty("os.name");
        String VersionSO = getProperty("os.version");
        String Arch = getProperty("os.arch");
        String Usuario = getProperty("user.name");
        String temp = getProperty("java.io.tmpdir");
        System.out.println("Información sobre el ordenador: ");
        System.out.println("- Nombre del sistema operativo: " + nombreSO);
        System.out.println("- Versión del sistema operativo: " + VersionSO);
        System.out.println("- Arquitectura del sistema: " + Arch);
        System.out.println("- Usuario actual: " + Usuario);
        System.out.println("- Carpeta de archivos temporales: " + temp);
    }
}
