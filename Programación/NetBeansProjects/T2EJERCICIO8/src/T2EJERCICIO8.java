/*Ejercicio 8 : Haz un programa en el que haya dos depósitos de agua de capacidad máxima 20
litros y con capacidades iniciales 15 y 5 litros respectivamente. Retira del primero cinco litros
de agua y añádelos al segundo. Dibuja los depósitos antes y después de la operación.*/
import bpc.daw.objetos.*;

public class T2EJERCICIO8 {

    public static void main(String args[]) {
        DepositoAgua d1 = new DepositoAgua(15, 20);
        DepositoAgua d2 = new DepositoAgua(5, 20);
        d1.dibujar();
        d2.dibujar();
        boolean retirar1 = d1.retirarLitro();
        boolean retirar2 = d1.retirarLitro();
        boolean retirar3 = d1.retirarLitro();
        boolean retirar4 = d1.retirarLitro();
        boolean retirar5 = d1.retirarLitro();
        
        boolean añadir1 = d2.añadirLitro();
        boolean añadir2 = d2.añadirLitro();
        boolean añadir3 = d2.añadirLitro();
        boolean añadir4 = d2.añadirLitro();
        boolean añadir5 = d2.añadirLitro();
        d1.dibujar();
        d2.dibujar();
    }
}
