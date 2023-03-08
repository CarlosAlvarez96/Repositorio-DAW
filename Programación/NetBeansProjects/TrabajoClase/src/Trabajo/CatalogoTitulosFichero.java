package Trabajo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.StringTokenizer;

public class CatalogoTitulosFichero implements CatalogoTitulos {

    private String ruta;
    private List<Titulo> titulos;

    public CatalogoTitulosFichero(String ruta) throws IOException {
        this.ruta = ruta;
        BufferedReader lector = new BufferedReader(new FileReader(ruta));
        String lineas = " ";

        while (lineas != null) {
            lineas = lector.readLine();
            Titulo t = this.extraerTitulo(lineas);
            this.titulos.add(t);
        }
        lector.close();
    }

    // linea = "12345678x;Carlos;DAW;2"
    private Titulo extraerTitulo(String linea) {
        StringTokenizer st = new StringTokenizer(linea, ";");
        String d = st.nextToken();
        String n = st.nextToken();
        String e = st.nextToken();

        // String[] trozos=linea.split(";");

        int estado = Integer.parseInt(st.nextToken());
        /*
         * Estado s = estado==0? Estado.SIN_RECOGER:
         * estado==1? Estado.RECIBIDO: Estado.RECOGIDO;
         */
        Estado s = Estado.values()[estado];

        TituloArchivo tA = new TituloArchivo(d, n, e, s);
        return tA;
    }

    @Override
    public List<Titulo> getTitulos() {
        return titulos;
    }

    @Override
    public boolean guardar() {
        boolean error = false;
        try {
            PrintWriter f = new PrintWriter(ruta);
            for (int i = 0; i < this.titulos.size(); i++) {
                f.println(this.titulos.get(i).toString());
            }
            error = f.checkError();
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        return error;
    }

    @Override
    public boolean añadirTitulo(String dni, String nombre, String estudio, Estado estado) {
        TituloArchivo t = new TituloArchivo(dni, nombre, estudio, estado);
        titulos.add(t);
        return true;
    }

}