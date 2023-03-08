
public record Localidad (int id, String nombre) implements Comparable<Localidad>{

    @Override
    public int compareTo(Localidad o) {
        //Ordenar por id
        //return this.id-o.id;
        //ordenar por orden lexicografico
        return this.nombre.compareTo(o.nombre);
    }

}
