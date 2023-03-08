/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospital;

/**
 *
 * @author CARLOS
 */
public class Paciente extends Enfermero{
    private String dni;
    private String nombre;
    private int edad;
    private Record historial;

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public Record getHistorial() {
        return historial;
    }
    
    
}
