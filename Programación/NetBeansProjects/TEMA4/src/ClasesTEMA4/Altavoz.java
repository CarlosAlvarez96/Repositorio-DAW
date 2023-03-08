package ClasesTEMA4;

public class Altavoz {
    public static final int VOL_MAX = 255;
    public static final int VOL_MIN = 0;
    private int volumen;

    public Altavoz() {
        this.volumen = VOL_MIN;
    }

    public void ponerVolumenMaximo() {
        this.volumen = VOL_MAX;
    }

    public void setVolumen(int v) {
        if (v < VOL_MIN) {
            v = VOL_MIN;
        } else if (v > VOL_MAX) {
            v = VOL_MAX;
        }
        volumen = v;
    }

    public int getVolumen() {
        return volumen;
    }

    public String toString() {
        String nivel = " ";
        double contador = 25.5;
        for (int i = 0; i < 10; i++) {
            if (volumen > contador) {
                nivel = nivel + '*';
            } else {
                nivel = nivel + '-';
            }
            contador += 25.5;
        }
        return "{" + volumen + "}" + nivel;
    }
}
