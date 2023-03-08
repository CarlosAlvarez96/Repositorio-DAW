
package com.iesHlanz.Paciente;


public class Programa {
    public static void main(String[] args) {
        Paciente a = new Paciente(123456, "Paco");
        Paciente b = new Paciente(223432,"Manuel");
        
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
    }
}
