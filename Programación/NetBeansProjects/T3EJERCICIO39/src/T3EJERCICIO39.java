/*
Ejercicio 39: Realiza un programa que muestre por pantalla todas las tablas de multiplicar del 1 
al 10. 
 */
public class T3EJERCICIO39 {

    public static void main(String args[]) {
        for (int i = 1; i < 11; i++) { //tabla del "i"
            for (int j = 1; j < 11; j++) { //multiplicador
                int res = i * j;
                System.out.println(i + "x" + j + "=" + res);
            }
        }
    }
}
