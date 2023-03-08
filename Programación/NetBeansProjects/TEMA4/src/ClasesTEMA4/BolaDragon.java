package ClasesTEMA4;

public class BolaDragon {

    private static final int MAXIMO_BOLAS = 7;
    private static int siguienteBola = 1;
    private int numero;

    private BolaDragon(int número) {
        BolaDragon db = new BolaDragon(siguienteBola);
        
    }

    public int getNumero() {
        return numero;
    }

    public static BolaDragon crearBolaDragón() throws Exception {
        if(MAXIMO_BOLAS-siguienteBola>=-1){
            BolaDragon bd = BolaDragon.crearBolaDragón();
            siguienteBola++;
            return bd;
        }else{
            throw new Exception("Ya has creado las 7 bolas de dragon");
        }
    }
}
