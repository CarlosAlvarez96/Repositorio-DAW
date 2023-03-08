
public record DescriptorArticulo(String nombre, String marca, int peso) implements Comparable<DescriptorArticulo> {

    @Override
    public int compareTo(DescriptorArticulo o) {
        int compare = 0;
        if(this.nombre.equals(o.nombre)){
            
        }else{
            compare=1;
        }
        return compare;
    }
    
}
