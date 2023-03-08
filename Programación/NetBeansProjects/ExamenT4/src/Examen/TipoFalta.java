package Examen;

public enum TipoFalta {
    JUSTIFICADA, INJUSTIFICADA, RETRASO;

    public boolean esTotal() {
        boolean total = false;
        if (this.equals(JUSTIFICADA) || this.equals(INJUSTIFICADA)) {
            total = true;
        }
        return total;
    }

    public boolean esParcial() {
        boolean parcial = false;
        if (this.equals(RETRASO)) {
            parcial = true;
        }
        return parcial;
    }
}
