
package com.iesHlanz.Ej_18_19_20_21;

public class Programa {
    public static void main(String[] args) {
        Paquete p = new Paquete("Gafas","Calle Huelva",2);
        Paquete q = new Paquete("Gorra","Calle Palencia",2);
        System.out.println(p.equals(q));
        
        EmpresaPremium eP = new EmpresaPremium();
        eP.registrarPedido(p);
        System.out.println(eP.getTransportistas());
        eP.enviarPaquetes();
        
        PaquetesPepe pp = new PaquetesPepe();
        System.out.println(pp.getTransportistas().toString());
        pp.registrarPedido(q);
        pp.registrarPedido(p);
        pp.enviarPaquetes();
        /*EmpresaLowCost lc = new EmpresaLowCost(15);
        System.out.println(lc.getTransportistas());
        lc.registrarPedido(q);
        lc.enviarPaquetes();
*/
    }
}
