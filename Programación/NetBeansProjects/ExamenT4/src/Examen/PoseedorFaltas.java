package Examen;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public interface PoseedorFaltas {

    public List<Falta> getFaltas();

    public default List<Falta> getFaltas(LocalDate inicio, LocalDate fin) {
        List<Falta> faltas = this.getFaltas();
        List<Falta> faltasFecha = new ArrayList<>();
        for (Falta i : faltas) {
            if (i.fecha().isAfter(inicio) && i.fecha().isBefore(fin)) {
                faltasFecha.add(i);
            }
        }
        return faltasFecha;
    }

    public default List<Falta> getFaltas(LocalDate fecha) {
        List<Falta> faltas = this.getFaltas();
        List<Falta> faltasFecha = new ArrayList<>();
        for (Falta i : faltas) {
            if (i.fecha().equals(fecha)) {
                faltasFecha.add(i);
            }
        }
        return faltasFecha;
    }
}
