/*Ejercicio 12 : En la librería ObjetosSencillos.jar se encuentra la clase MarcadorBaloncesto. Haz 
un programa en el que se cree un partido de baloncesto para el partido que van a jugar el 
Estudiantes y el CB Granada. Registra las siguientes canastas y muestra el nombre de los 
equipos, los puntos que tiene cada uno, el nombre del equipo que va ganando y el que va 
perdiendo. 
E ->2, CB -> 3, E->2, CB->2, CB->3, E->1, E->1, CB->2 */
import bpc.daw.objetos.MarcadorBaloncesto;


public class T2EJERCICIO12 {
    public static void main(String args[]) {
        MarcadorBaloncesto m = new MarcadorBaloncesto("Estudiantes","CB Granada");
        m.anotarCanasta('L', 2);
        m.anotarCanasta('V', 3);
        m.anotarCanasta('L', 2);
        m.anotarCanasta('V', 2);
        m.anotarCanasta('V', 3);
        m.anotarCanasta('L', 1);
        m.anotarCanasta('L', 1);
        m.anotarCanasta('V', 2);
        String NombreLocal = m.getNombreLocal();
        String NombreVisitante = m.getNombreVisitante();
        int PuntosLocal = m.getPuntosLocal();
        int PuntosVisitante = m.getPuntosVisitante();
        String EquipoGanador = m.getNombreEquipoGanador();
        String EquipoPerdedor = m.getNombreEquipoPerdedor();
        System.out.println("El equipo local es: "+NombreLocal+", el equipo visitante es: "
                +NombreVisitante+", el equipo local tiene: "+PuntosLocal+" puntos, el equipo visitante tiene: "
                +PuntosVisitante+", el equipo ganador es: "+EquipoGanador+", el equipo perdedor es: "+EquipoPerdedor);
    }
}
