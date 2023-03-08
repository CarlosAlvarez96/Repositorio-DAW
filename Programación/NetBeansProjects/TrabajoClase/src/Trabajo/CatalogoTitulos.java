package Trabajo;

import java.util.List;
import java.util.NoSuchElementException;

public interface CatalogoTitulos {

    public List<Titulo> getTitulos();

    public boolean guardar();

    public boolean añadirTitulo(String dni, String nombre, String estudio, Estado estado);

    public default Titulo getTitulo(String dni) {
        Titulo tituloEncontrado = null;

        List<Titulo> titulos = this.getTitulos();

        for (int i = 0; i < titulos.size() && tituloEncontrado == null; i++) {
            Titulo ti = titulos.get(i);
            if (dni.equals(ti.getDni())) {
                tituloEncontrado = ti;
            }
        }
        if (tituloEncontrado == null) {
            throw new NoSuchElementException("No esta el DNI en la lista");
        }

        return tituloEncontrado;
    }
}
