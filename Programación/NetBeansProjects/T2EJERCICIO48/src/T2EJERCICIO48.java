/*Ejercicio 48 : En la librería “Objetos Sencillos” está la clase MarcadorMejorado. Haz un 
programa en el que se cree un partido de baloncesto para el partido que van a jugar el 
Estudiantes y el CB Granada. Registra las siguientes canastas y muestra el nombre de los 
equipos, los puntos que tiene cada uno, el nombre del equipo que va ganando y el que va 
perdiendo. Compara el código con el del ejercicio 12. ¿Cuál crees que es mejor? 
    E ->2, CB -> 3, E->2, CB->2, CB->3, E->1, E->1, CB->2 */
import bpc.daw.objetos.MarcadorMejorado;

public class T2EJERCICIO48 {

    public static void main(String[] args) {
        MarcadorMejorado MB = new MarcadorMejorado("CB", "E");

        int L = MB.CANASTA_LOCAL;
        int V = MB.CANASTA_VISITANTE;

        int punto1 = MB.TIRO_LIBRE;
        int punto2 = MB.NORMAL;
        int punto3 = MB.TRIPLE;

        MB.anotarCanasta(V, punto2);
        MB.anotarCanasta(L, punto3);
        MB.anotarCanasta(V, punto2);
        MB.anotarCanasta(L, punto2);
        MB.anotarCanasta(L, punto3);
        MB.anotarCanasta(V, punto1);
        MB.anotarCanasta(V, punto1);
        MB.anotarCanasta(L, punto2);

        int pl = MB.getPuntosLocal();
        int pv = MB.getPuntosVisitante();

        if (pl > pv) {
            System.out.println("EL Estudiantes va ganando con " + pl + " puntos y el CB Granada va perdiendo con: "+pv);
        } else if (pl < pv) {
            System.out.println("El CB Granada va ganando con " + pv + " puntos y el Estudiantes va perdiendo con: "+pl);
        } else {
            System.out.println("El partido esta empatado");
        }
    }
}


