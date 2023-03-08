package ClasesTEMA4;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Random;

public class Bombo {
    private Queue<Bola> bolas;

    public Bombo(int totalBolas) {
        bolas= new ArrayDeque<>();
        Random r = new Random();
        for(int i=0;i<totalBolas;i++){
            bolas.add(new Bola(r.nextInt(100)+1));
        }
    }

    public int getNúmeroBolas() {
        return bolas.size();
    }

    public Bola sacarBola() {
        return bolas.poll();
    }
}
