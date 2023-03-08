
package ClasesTEMA4;


public class Programa {

    public static void main(String args[]) {
        MarcadorDefinitivo marcador = new MarcadorDefinitivo("CB Betis","CB Alcoyano");
        marcador.añadirCanasta(tipoEquipo.LOCAL, TipoCanasta.TRIPLE);
        marcador.añadirCanasta(tipoEquipo.VISITANTE, TipoCanasta.TIRO_LIBRE);
        String m = marcador.getNombreEquipo(tipoEquipo.VISITANTE);
        System.out.println(m);
    }
}
