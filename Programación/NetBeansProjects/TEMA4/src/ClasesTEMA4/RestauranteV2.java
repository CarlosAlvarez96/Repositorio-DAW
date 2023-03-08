package ClasesTEMA4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RestauranteV2 {

    private String nombre;
    private Map<String, Integer> carta;

    // constructor principal
    public RestauranteV2(String n, Map<String, Integer> p) {
        nombre = n;
        carta = p;
    }

    // crea un restaurante con estos platos: bocadillo (5€), sopa(8€), filete(10€)
    public RestauranteV2(String n) {
        this(n, new HashMap<String, Integer>() {
            {
                put("bocadillo", 5);
                put("sopa", 8);
                put("filete", 10);
            }
        });
    }

    // devuelve el nombre del restaurante
    public String getNombre() {
        return nombre;
    }

    // hace que el restaurante ofrezca el plato pasado como parámetro
    public void añadir(String plato, int precio) {
        carta.put(plato, precio);
    }

    // devuelve el precio del plato que pasamos como parámetro. Si el plato no lo
    // ofrece
    // el restaurante,se lanzará una IllegalArgumentException con el mensaje “Ese
    // plato no se ofrece”
    public int getPrecio(String plato) {
        int valor = carta.getOrDefault(plato, 3000);
        if (valor == 3000) {
            throw new IllegalArgumentException("Ese plato no se ofrece");
        }
        return valor;
    }

    // devuelve true si el plato pasado como parámetro se ofrece en el restaurante
    public boolean estaDisponible(String plato) {
        boolean disponible = false;
        if (carta.containsKey(plato)) {
            disponible = true;
        } else {
            disponible = false;
        }
        return disponible;
    }

    // devuelve una lista con los platos que cuestan más de 12 €
    public List<String> getPlatosCaros() {
        List<String> platosCaros = new ArrayList<>();
        for (String plato : carta.keySet()) {
            int precio = carta.get(plato);
            if (precio > 12) {
                platosCaros.add(plato);
            }
        }
        return platosCaros;
    }

    // devuelve el precio de todos los platos que se pasan como parámetro. Si alguno
    // de los
    // platos no está en el restaurante, se lanzará una IllegalArgumentException con
    // el mensaje “Ese
    // plato no se ofrece”
    public int getCuenta(String[] platos) {
        int precioTotal = 0;
        for (String plato : platos) {
            if (carta.containsKey(plato)) {
                int precio = carta.get(plato);
                precioTotal += precio;
            } else {
                throw new IllegalArgumentException("Ese plato no se ofrece");
            }
        }
        return precioTotal;
    }

    // Este método guarda en el archivo menu.txt todos los platos ofrecidos por el
    // restaurante, cada
    // uno con su precio
    public void guardar() throws IOException {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("menu.txt"));

            for (String clave : carta.keySet()) {
                int valor = carta.get(clave);
                bw.write(clave + " vale " + valor + "€");
                bw.newLine();
            }
        } catch (IOException e) {
            throw e;
        }
    }
}
