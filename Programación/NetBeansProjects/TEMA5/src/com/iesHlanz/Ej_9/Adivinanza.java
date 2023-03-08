package com.iesHlanz.Ej_9;

import java.time.Instant;

public class Adivinanza {

    private String enunciado;
    private String respuestaCorrecta;
    private Instant inicio;

    public Adivinanza(String e, String rc) {
        this.enunciado=e;
        this.respuestaCorrecta=rc;
        this.inicio=null;
    }

    public String getEnunciado() {
        this.inicio=Instant.now();
        return this.enunciado;
    }

    public void comprobar(String respuesta) throws AdivinanzaException {
        System.out.println(this.getEnunciado());
        if(respuesta.equals(this.respuestaCorrecta)){
            Instant respondido = Instant.now();
            if(respondido.isAfter(this.inicio.plusSeconds(30))){
                throw new TiempoSuperadoException();
            }
        }else{
            throw new AdivinanzaIncorrectaException();
        }
    }
}
