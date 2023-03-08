/*Ejercicio 5 : Realiza un programa con la librería de Mario Bros en el que haya dos cañones. Haz
que el primero dispare dos veces y el segundo tres. Pregunta a los dos cañones cuántas veces
han disparado y muestra dichos valores por pantalla. */

import java.util.*;
import bpc.daw.mario.*;
public class T2EJERCICIO5 {
    public static void main(String args[]) {
        Cañon c1 = new Cañon(300,400);
        Cañon c2 = new Cañon(350,400);
        c1.disparar(100, 400);
        c1.disparar(100,900);
        c2.disparar(900, 400);
        c2.disparar(900, 900);
        c2.disparar(900, 100);
        int disparos1=c1.getTotalDisparosRealizados();
        int disparos2=c2.getTotalDisparosRealizados();
        System.out.println("El total de disparos del primer cañon es: "+disparos1+" y el segundo ha disparado: "+disparos2+" disparos");
    }
}
