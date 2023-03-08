
package com.ieshlanz.tema4;

import java.awt.Color;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CocheTest {
    
    public CocheTest() {
    }

    
    /*public void testSomeMethod() {
        Coche c = new Coche("1234ABC",Color.BLACK);
        assertEquals("1234ABC",c.matricula);
        assertEquals(0,c.velocidad);
        assertEquals(Color.BLACK,c.color);
        
        
        Coche c2= new Coche("1234ABC", Color.BLACK,40,true);
        assertEquals(40,c2.velocidad);
        assertEquals(true,c2.encendido);
    }*/
    @Test
public void testSomeMethod(){
    Coche c=new Coche("4932ABE", Color.red);
    assertEquals("4932ABE",c.getMatricula());
    assertEquals(Color.red, c.getColor());
    assertEquals(0,c.getVelocidad());
    assertEquals(false,c.estaEncendido());
    Coche c2= new Coche("hola");
    assertEquals("0000AAA",c2.getMatricula());
    }
}

