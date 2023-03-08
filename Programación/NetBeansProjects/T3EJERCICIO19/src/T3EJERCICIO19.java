
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

/*
Ejercicio 19: Realiza un programa que pregunte por teclado una dirección IP y un número 
entero. El programa usará la clase InetAddress para realizar la cantidad de pings indicada a la 
dirección IP, midiendo el tiempo empleado en hacer cada uno (clases Instant y Duration), y 
mostrará el resultado de esta forma:
 */
public class T3EJERCICIO19 {

    public static void main(String args[]) {
        System.out.println("Introduzca una direccion IP como un String:xxx.ttt.yyy.zzz");
        String ip = new Scanner(System.in).nextLine();
        System.out.println("Introduzca un numero entero ");
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++) {
            try {
                InetAddress ia = InetAddress.getByName(ip);
                InetAddress nombreip = ia.getLocalHost();
                Instant instante = Instant.now();
                Thread.sleep(1000);
                if (ia.isReachable(n)) {
                    System.out.println(ip);
                } else {
                    ia = null;
                }
                Instant instante2 = Instant.now();
            } catch (UnknownHostException e) {
                System.out.println(e);
            } catch (IOException ee) {
                System.out.println(ee);
            }catch (InterruptedException error) {
                System.out.println(error);
            }
        System.out.println("Haciendo ping a " + nombreip + ia);
        System.out.println(Duration.between(instante, instante2).toMillis());
        System.out.println(Duration.between(instante, instante2).toMinutes());
    }
}
}
