package ClasesTEMA4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Notas {

    private List<Double> notas;

    public Notas() {
        notas = new ArrayList<Double>();
    }

    public void añadirNota(double n) {
        notas.add(n);
    }

    public int getTotalNotas() {
        int TotalNotas = notas.size();
        return TotalNotas;
    }

    public double calcularNotaMedia() {
        double media = 0.0;
        double total = 0.0;
        if (notas.isEmpty()) {
            throw new IllegalStateException("No hay notas para calcular la nota media");
        } else {

            for (int i = 0; i < notas.size(); i++) {
                total += notas.indexOf(i);
                media = total/notas.size();
            }
        }
        return media;
    }

    public double calcularNotaMaxima() {
        double notaMax = Collections.max(notas);
        return notaMax;
    }
}
