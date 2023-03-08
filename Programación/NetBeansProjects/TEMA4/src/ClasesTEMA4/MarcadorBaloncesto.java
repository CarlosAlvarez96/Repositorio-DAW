package ClasesTEMA4;
/*Pon privadas las propiedades de MarcadorBaloncesto y añade estos métodos: 
MarcadorBaloncesto
+ int getPuntosLocal() 
+ int getPuntosVisitante() 
+ boolean ganaLocal() 
+ boolean ganaVisitante() 
+ boolean hayEmpate() 
 getPuntosLocal y getPuntosVisitante devuelven los puntos de los respectivos equipos 
 ganaLocal, ganaVisitante y hayEmpate devuelven true según esté ganando el equipo 
local, el visitante, o ambos equipos tengan los mismos puntos. */
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

public class MarcadorBaloncesto {
    private String nombreLocal;
    private String nombreVisitante;
    private int puntosLocal;
    private int puntosVisitante;
    private LocalDate fecha;

    public MarcadorBaloncesto(String nL, String nV) {
        this(nL, 0, nV, 0, LocalDate.now());
    }

    private MarcadorBaloncesto(String nL, String nV, int par, int par1, LocalDate f) {
        this(nL, 0, nV, 0, f);

    }

    private MarcadorBaloncesto(String nL, int pL, String nVI, int pV, LocalDate fecha) {
        nombreLocal = nL;
        puntosLocal = pL;
        nombreVisitante = nVI;
        puntosVisitante = pV;
        this.fecha = LocalDate.now();
    }

    private void añadirCanasta(char equipo, int puntos) {
        if(equipo == 'L') {
            puntosLocal += puntos;
        } else if (equipo == 'V') {
            puntosVisitante += puntos;
        }
    }

    private void reset() {
        puntosLocal = 0;
        puntosVisitante = 0;
    }
    
    /*---------------------------Ejercicio15-------------------------*/

    public int getPuntosLocal() {
        return puntosLocal;
    }

    public int getPuntosVisitante() {
        return puntosVisitante;
    }

    public boolean ganaLocal() {
        return puntosLocal > puntosVisitante;
    }

    public boolean ganaVisitante() {
        return this.puntosVisitante > puntosLocal;
    }

    public boolean hayEmpate() {
        return this.puntosLocal == puntosVisitante;
    }
    
    /*-----------------------------Ejercicio 19--------------------------*/
    public void guardar(String ruta) throws IOException{
        PrintWriter file = new PrintWriter(ruta);
            file.println(nombreLocal + "Tiene "+ this.puntosLocal +"y " + this.nombreVisitante
                    + "tiene "+ this.puntosVisitante);
        
        file.close();
    }
}