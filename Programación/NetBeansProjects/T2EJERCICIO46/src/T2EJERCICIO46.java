
import java.util.Random;
import java.lang.*;
import java.time.Duration;
import java.time.Instant;

/*
Ejercicio 46 : Consulta la “Librería estándar de Java” y busca las clases Thread y Random. Haz 
un programa que haga una pausa de una cantidad aleatoria de segundos entre 0 y 10. 
Consulta ahora el pdf de la librería “java time” y busca las clases Instant y Duration. Obtén un 
objeto Instant antes de que empiece la pausa y luego otro objeto Instant cuando la pausa 
termine. A partir de dichos dos objetos, obtén un objeto Duration y úsalo para mostrar 
cuántos segundos ha durado la pausa. 

 */
public class T2EJERCICIO46 {
    public static void main(String args[])throws Exception {
        Random ran = new Random();
        int segundos =ran.nextInt(11);
        Instant t1 = Instant.now();
        try{
        Thread.sleep(segundos*1000);
                }catch(Exception c){
                    System.out.println(c);
                }
        Instant t2 = Instant.now();
        System.out.println(Duration.between(t1, t2));
    }
}
