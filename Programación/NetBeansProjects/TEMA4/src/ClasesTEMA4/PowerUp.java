
package ClasesTEMA4;


public interface PowerUp {
    
    public String getNombre();
    public void aplicar(Personaje p);
    
    //este método devuelve un objeto curar o un veneno
    public static PowerUp getPowerAleatorio(){
        return Math.random()<0.5? new Curar(): new Veneno();
    }
}
