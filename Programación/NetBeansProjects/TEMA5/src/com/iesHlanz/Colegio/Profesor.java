package com.iesHlanz.Colegio;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Profesor {

    private String nombre;
    private String asignatura;
    private List<CalificacionListener> interesados;
    private Map<Alumno, Double> notas;

    public Profesor(String nombre, String asignatura) {
        this.interesados = new ArrayList<>();
        this.nombre = nombre;
        this.notas = new HashMap<>();
        this.asignatura = asignatura;
    }

    public void addCalificacionListener(CalificacionListener interesado) {
        this.interesados.add(interesado);
    }

    public void calificar(Alumno a, double n) {
        this.notas.put(a, n);
        for (CalificacionListener c : interesados) {
            a.recibirCalificacion(this, a, new Nota(n));
        }

    }

    public String getAsignatura() {
        return this.asignatura;
    }
}
