
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T3EJERCICIO48 {

    public static void main(String args[]) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Pepe", 9385);
        map.put("Manuel", 1234);
        map.put("Ana", 1085);
        System.out.println("Introduzca un usuario");
        String user = new Scanner(System.in).nextLine();
        System.out.println("Introduzca un pin de 4 dígitos");
        int pin = new Scanner(System.in).nextInt();
        for (int i = 0; i > map.size(); i++) {
            int a=map.get(i);
            if (pin == a && map.containsKey(a)) {
                System.out.println("Acceso permitido");
            } else if (pin != a) {
                System.out.println("Pin incorrecto");
            } else {
                System.out.println("Usuario incorrecto");
            }

        }
    }
}
