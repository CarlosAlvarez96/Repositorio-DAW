
package com.iesHlanz.Explicacion.Herencia;

//Checked exception porque hereda de Exception
public class IsmaelException extends Exception{
    //La clase padre de las checked exception es Exception
    public IsmaelException(String mensaje){
        super(mensaje);
    }
}
