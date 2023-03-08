
package com.iesHlanz.Ejercicio_31;

public class EfectoFactory {
    public static EfectoEspecial getEfecto(TipoEfecto tipo) {
    EfectoEspecial eE = null;
    if (tipo == TipoEfecto.MAYÚSCULAS) {
        eE = new EfectoMayusculas();
    } else if (tipo == TipoEfecto.INVERSO) {
        eE = new EfectoInverso();
    } else if (tipo == TipoEfecto.CORCHETES) {
        eE = new EfectoCorchetes();
    } else if (tipo == TipoEfecto.GUIONES) {
        eE = new EfectoGuiones();
    }
    return eE;
}

}
