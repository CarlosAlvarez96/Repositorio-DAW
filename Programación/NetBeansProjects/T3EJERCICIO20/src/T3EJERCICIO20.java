
import bpc.daw.consola.*;
import java.time.LocalTime;

/*
Ejercicio 20: Usa la Consola DAW y las clases de Java Time para realizar un programa que 
muestre en el centro de la pantalla la hora, minutos y segundos actuales. Durante medio 
minuto, a cada segundo la pantalla se borrará y se volverá a imprimir la hora actual, dando la 
apariencia de un reloj. 
 */
public class T3EJERCICIO20 {
    public static void main(String args[]) {
        Consola c = new Consola();
        CapaTexto ct = c.getCapaTexto();
        LocalTime hora = LocalTime.now();
        String shora =hora.toString();
        for(int i = 0; i<60;i++){
        ct.print(shora);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println(ex);
        }
        ct.cls();
    }
    }      
}
