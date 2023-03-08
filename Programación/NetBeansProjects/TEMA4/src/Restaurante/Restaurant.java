package Restaurante;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private String nombre;
    private String[] platos;
    private int[] precios;

    public Restaurant(String n, String[] pl, int[] pr) {
        nombre = n;
        platos = pl;
        precios = pr;
    }

    public Restaurant(String n) {
        this(n, new String[]{"bocadillo", "sopa", "filete"}, new int[]{5, 8, 10});
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio(String plato) {
        int p = 0;
        for (int i = 0; i < platos.length; i++) {
            if (platos[i].equals(plato)) {
                p = precios[i];
            }
        }
        return p;
    }

    public boolean estaDisponible(String plato) {
        boolean tienePlato = false;
        for (int i = 0; i < platos.length && tienePlato == false; i++) {
            if (platos[i].equals(plato)) {
                tienePlato = true;
            }
        }
        return tienePlato;
    }

    public List<String> getPlatosCaros() {
        List<String> listaCaros = new ArrayList<>();
        for (int i = 0; i < precios.length; i++) {
            if (precios[i] > 12) {
                listaCaros.add(platos[i]);
            }
        }
        return listaCaros;

    }
    
    public int getCuenta(String[] platos){
        int precioTotal=0;
        for(int i = 0; i<platos.length;i++){
            precioTotal+= this.getPrecio(platos[i]);
        }
        return precioTotal;
    }
}
