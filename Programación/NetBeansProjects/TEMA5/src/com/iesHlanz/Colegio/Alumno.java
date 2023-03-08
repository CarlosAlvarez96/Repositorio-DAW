package com.iesHlanz.Colegio;

import java.util.ArrayList;
import java.util.List;

public record Alumno(String nombre, List<Nota> notas) implements CalificacionListener {

    public double getNotaMedia() {
        double notaMedia =0;
        for(Nota i : notas){
            notaMedia +=i.valorNumerico();
        }
        return notaMedia/notas.size();
    }

    @Override
    public void recibirCalificacion(Profesor p, Alumno a, Nota nota) {
        if (a.nombre.equals(nombre)) {
            notas.add(nota);
        }
    }
}
