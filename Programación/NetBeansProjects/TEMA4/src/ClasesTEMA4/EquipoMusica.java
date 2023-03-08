package ClasesTEMA4;

public class EquipoMusica {
    private Altavoz[] altavoces;

    public EquipoMusica(int numeroAltavoces) {

        altavoces = new Altavoz[numeroAltavoces];
        for (int i = 0; i < numeroAltavoces; i++) {
            altavoces[i] = new Altavoz();
        }
    }

    public Altavoz getAltavoz(int posición) {
        return altavoces[posición];
    }

    public void setVolumen(int numeroAltavoz, int volumen) {
        altavoces[numeroAltavoz].setVolumen(volumen);
    }
}
