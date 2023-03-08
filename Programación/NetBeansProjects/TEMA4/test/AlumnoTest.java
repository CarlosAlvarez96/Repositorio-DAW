


import org.junit.Test;

import Colegio.Alumno;
import Colegio.Colegio;

import static org.junit.Assert.*;

public class AlumnoTest {
    
    public AlumnoTest() {
    }

    @Test
    public void test1() {
        //crea un alumno de 10 años y comprueba que su curso recomendado es primaria
        Alumno a = new Alumno("Carlos",10);
        assertEquals("primaria",a.getCursoRecomendado());
    }
    
    @Test
    public void test2() {
        //crea un alumno de 14 años y comprueba que está en 3º de la eso y la edad recomendada para ese curso es 14 años
        Alumno a = new Alumno("Carlos", 14);
        assertEquals("3º ESO", a.getCursoRecomendado());
        assertEquals(14,a.getEdadRecomendada(a.getCursoRecomendado()));
        
    }
    
    @Test
    public void test3(){
    //Crea un colegio que se llame IES HLANZ y añade un alumno.
    //Comprueba que el colegio tiene 1 alumno
    Colegio c= new Colegio("IES HLANZ");
    c.matricular(new Alumno("Carlos",26));
    assertEquals(1, c.getNumeroAlumnos());
}
    
    @Test
    public void test4(){
        //Crea el colegio de antes y añade estos alumnos
        // Juan 13
        // Antonio 13
        // Ana 15
        // Julio 15
        // Pedro 13
        //Comprueba que el numero de alumnos de 2ºESO es 3 y 4º ESO es 2
        Colegio c = new Colegio("IES HLANZ");
        
        c.matricular(new Alumno("Juan",13));
        c.matricular(new Alumno("Antonio",13));
        c.matricular(new Alumno("Ana",15));
        c.matricular(new Alumno("Julio",15));
        c.matricular(new Alumno("Pedro",13));
        assertEquals(3, c.getNumeroAlumnos2ºESO());
        assertEquals(2, c.getAlumnos("4º ESO").size());
    }
    
    // IMPORTANTE
    @Test (expected = IllegalArgumentException.class)
    public void test5(){
        //Crea un colegio que se llame "COLE HLANZ" y comprueba que se lanza una IllegalArgumentException
        Colegio c= new Colegio("COLE HLANZ");
        
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void test6(){
        //Crea un alumno y pide la edad recomendada para el curso 9º ESO, comprueba que se lanza una IllegalArgumentException
        Alumno a= new Alumno("Carlos",10);
        int edad= a.getEdadRecomendada("9º ESO");
    }
    
    @Test
    public void test7(){
        Colegio c = new Colegio("IES HLANZ");
        c.matricular(new Alumno("Juan",13));
        c.matricular(new Alumno("Antonio",13));
        c.matricular(new Alumno("Ana",15));
        c.matricular(new Alumno("Julio",15));
        c.matricular(new Alumno("Pedro",13));
        //Comprueba que la edad media es de 13,8 años
        //deprecated (en desuso)
        //assertEquals(13.8,c.getEdadmedia()); en desuso
        assertEquals(13.8,c.getEdadmedia(),0.01); //Forma buena, no deprecated
    }
    
}
