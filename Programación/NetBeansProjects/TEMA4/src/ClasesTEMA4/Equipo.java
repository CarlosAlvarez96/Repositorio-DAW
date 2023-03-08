
package ClasesTEMA4;


public record Equipo (String nombre,int puntos){
    
    public Equipo(String nombre){
       this(nombre,0);
    }
    public Equipo añadirCanasta(TipoCanasta t){
        return new Equipo(nombre,puntos+t.getValor());
    }
}
