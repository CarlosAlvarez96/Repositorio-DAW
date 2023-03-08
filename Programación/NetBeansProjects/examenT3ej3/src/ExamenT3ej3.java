
import bpc.daw.consola.CapaCanvas;
import bpc.daw.consola.Consola;
import com.jd.diana.Dardo;
import com.jd.diana.Diana;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ExamenT3ej3 {

    public static void main(String args[]) {
        Map<String,Color> map= new HashMap<>();
        map.put("Manuel", Color.cyan);
        map.put("Ana", Color.magenta);
        map.put("José", Color.white);
        map.put("Luis", Color.pink);
        map.put("María", Color.orange);
        
        Color[] listaColores = {Color.red, Color.yellow, Color.lightGray, Color.green};
        Diana d = new Diana(800, 800, 400, listaColores);
        Consola c = new Consola();
        CapaCanvas cc = c.getCapaCanvas();
        Graphics g = cc.getGraphics();
        d.dibujar(g);
        for (int i = 0; i < map.size(); i++) {
            for (int j = 0; j < 20; j++) {
                if (j == 0) {
                    Dardo dar = new Dardo(5, map.get(i));
                //    Color puntos= Diana.disparar_y_verColor(dar);  
                } else if (i == 1) {
                    Dardo dar2 = new Dardo(5, map.get(i));
                } else if (i == 2) {
                    Dardo dar3 = new Dardo(5, map.get(i));
                } else if (i == 3) {
                    Dardo dar4 = new Dardo(5, map.get(i));
                } else if (i == 4) {
                    Dardo dar5 = new Dardo(5, map.get(i));
                }
                    try {
                        Thread.sleep(10000);
                    } catch (InterruptedException ie) {
                        System.out.println(ie);
                    }
                }
            }
        }
    }
