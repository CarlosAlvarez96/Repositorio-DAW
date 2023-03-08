import bpc.daw.mario.*;
public class MARIO {
    public static void main(String args[]) {
        Mario m= new Mario(300,300);
        m.correrHacia(600, 300);
        Planta p= new Planta(350,300);
        Luigi l= new Luigi(400,300);
        l.girar();
        Disparo d=new Disparo(500,300,200,300);
    }
}
