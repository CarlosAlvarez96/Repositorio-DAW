package ClasesTEMA4;

import java.time.LocalTime;

public class Reloj {

    private LocalTime hora;

    public Reloj() {
        hora = LocalTime.now();
    }

    public void añadir(int segundos) {
        hora.withSecond(hora.getSecond() + segundos);
    }

    public boolean esNoche() {
        boolean noche = false;
        int horaA = hora.getHour();
        if (horaA > 8 && horaA < 20) {
            noche = true;
        }
        return noche;
    }

    public void esperar(int segundos) {
        hora.withSecond(hora.getSecond() - segundos);
    }

    public String toString() {
        int hora2 = hora.getHour();
        int min2= hora.getMinute();
        int seg2= hora.getSecond();
        String horaS = String.valueOf(hora2);
        String minS = String.valueOf(min2);
        String segS = String.valueOf(seg2);
        return horaS+":"+minS +":"+segS;
    }

}
