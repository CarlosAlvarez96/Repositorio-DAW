package com.iesHlanz.Colegio;

public enum Valoracion {
    MUY_DEFICIENTE, INSUFICIENTE, SUFICIENTE, BIEN, NOTABLE, SOBRESALIENTE;

    public boolean esAprobado() {
        boolean aprobado = false;
        if (this.equals(this.BIEN) || this.equals(this.NOTABLE) || this.equals(this.SUFICIENTE) || this.equals(this.SOBRESALIENTE)) {
            aprobado = true;
        }
        return aprobado;
    }

    public boolean esSuspenso() {
        boolean suspenso = false;
        if (this.equals(this.INSUFICIENTE) || this.equals(this.MUY_DEFICIENTE)) {
            suspenso = true;
        }
        return suspenso;
    }
}
