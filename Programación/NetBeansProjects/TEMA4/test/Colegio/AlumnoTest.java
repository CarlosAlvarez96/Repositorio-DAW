/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Colegio;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CARLOS
 */
public class AlumnoTest {
    
    public AlumnoTest() {
    }

    @Test
    public void testSomeMethod() {
        //Crea 4 objetos de la clae Alumno y comprueba que el método getNumeroTotalAlumnos funciona bien
        
        Alumno a = new Alumno("Carlos", 26);
        Alumno b = new Alumno("Marcos", 22);
        Alumno c = new Alumno("María", 22);
        Alumno d = new Alumno("Julia", 26);
        assertEquals(4,Alumno.getNumeroTotalAlumnos());

        
    }
    
    //
    
}
