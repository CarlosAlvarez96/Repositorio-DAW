/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package ClasesTEMA4;

/**
 *
 * @author CARLOS
 */
public class ResPrueba {


    public static void main(String args[]) {
        RestauranteV2 r = new RestauranteV2("Casa Paco");
        int num = r.getPlatosCaros().size();
        System.out.println(num);
    }
}
