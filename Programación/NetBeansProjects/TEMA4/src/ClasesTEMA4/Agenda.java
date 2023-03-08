
package ClasesTEMA4;


public class Agenda {
    private Dia dia;
    private String deberes;
    
    public Agenda(Dia dia, String deberes){
        this.dia=dia;
        this.deberes=deberes;
    }

    public Dia getDia() {
        return dia;
    }

    public String getDeberes() {
        return deberes;
    }
    
}
