/*
Ejercicio 8: La distancia entre Granada y Jaén es de 92km. A las 12:00h un coche sale desde
Granada hacia Jaén a 120km/h y a la vez un camión sale desde Jaén hacia Granada a 70km/h.
Realiza un programa que muestre en pantalla la hora a la que se encuentran. Además, deberá
mostrarse la distancia, medida desde Granada, a la que se produce el encuentro
 */
public class T2RepasoEj8 {
    public static void main(String args[]) {
        int distanciaTotalKm = 92;
        int velocidadKmHG = 120;
        int velocidadKmHJ = 70;
        double velocidadKmMinG = velocidadKmHG/60;
        double velocidadKmMinJ = velocidadKmHJ/60;
        double tiempoMinCruce =distanciaTotalKm/(velocidadKmMinG+velocidadKmMinJ);
        System.out.println("12:"+(int)tiempoMinCruce+'h');
        System.out.println((/*(int)*/tiempoMinCruce*velocidadKmMinG)+" km de distancia desde Granada al punto de encuentro");    }
}
