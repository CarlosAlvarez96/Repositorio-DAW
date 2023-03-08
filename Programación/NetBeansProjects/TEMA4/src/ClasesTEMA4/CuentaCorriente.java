package ClasesTEMA4;

import java.util.Random;

public class CuentaCorriente {

    public int numero;
    public double saldo;

    public CuentaCorriente() {
        this(new Random().nextInt(0, 1000), 0);
        /*Random r = new Random();
        numero=r.nextInt(0, 1000);
        saldo = 0;*/
    }

    public CuentaCorriente(int numero) {
        this(numero, 0);
    }

    public CuentaCorriente(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    public void añadirDinero(int cantidad) {

        if (cantidad < 0) {
            System.out.println("no has introducido una cantidad valida");
        } else {
            saldo += cantidad;
        }
    }

    /*-----------------------Ejercicio 18--------------------------*/
    public void retirarDinero(int cantidad) throws Exception {
        if (cantidad < 0) {
            System.out.println("no has introducido una cantidad valida");
        } else if (saldo < cantidad) {
            throw new Exception("Error, saldo inferior a cantidad");
        } else {
            saldo -= cantidad;
        }
    }
}
