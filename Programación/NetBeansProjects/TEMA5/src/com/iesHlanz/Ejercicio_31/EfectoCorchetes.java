
package com.iesHlanz.Ejercicio_31;

public class EfectoCorchetes implements Simetrico,EfectoEspecial{
    protected EfectoCorchetes(){
        
    }

    @Override
    public String getNombre() {
        return TipoEfecto.CORCHETES.toString();
    }

    @Override
    public String aplicarEfecto(String frase) {
        String fraseModificada = frase;
        String fraseFinal=" ";
        if(frase.charAt(0)=='[' && frase.charAt(frase.length()-1)==']'){
            fraseModificada.replace("[", " ");
            fraseModificada.replace("]", " ");
        }else{
             fraseFinal = "["+fraseModificada+"]";
        }
        return fraseFinal;
    }
}
