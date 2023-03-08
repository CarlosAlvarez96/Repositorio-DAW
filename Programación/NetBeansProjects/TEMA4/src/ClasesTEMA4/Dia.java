package ClasesTEMA4;

public enum Dia {
    //Constantes
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO;

    //Métodos
    public boolean esFinde() {
        //return this.equals(Dia.SABADO) || this.equals(Dia.DOMINGO);
        int pos = this.ordinal();
        return pos>=5;
    }

    public boolean esLaborable() {
        //Llamo a esFinde y si pasa lo contrario(!) devuelve true, sino devuelve false
        return !this.esFinde();
    }
}
