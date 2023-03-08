package PRODUCTOS;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tienda implements GestionProductos {

    private String nombre;
    private double precio;
    private Categoria cat;
    private int stock;
    private List<Producto> ListaProductos;

    public Tienda() {
        this.ListaProductos = new ArrayList<>();
    }
    public Categoria getCategoria(){
        return this.cat;
    }

    @Override
    public void agregarProducto(Producto p) {
        this.ListaProductos.add(p);
    }

    @Override
    public void eliminarProducto(Producto p) {
        this.ListaProductos.remove(p);
    }

    @Override
    public void mostrarProducto(Producto p) {
          Collections.sort(this.ListaProductos, (p1, p2) -> Double.compare(p1.precio(), p2.precio()));
        for (int i = 0; i < this.ListaProductos.size(); i++) {
           String producto = this.ListaProductos.get(i).toString();
            double precio = this.ListaProductos.get(i).precio();
            System.out.println(producto + " "+precio);
        }

    }

    @Override
    public void mostrarProducto(Categoria cat) {
        List<Producto> productosAlimentacion = new ArrayList<>();
        List<Producto> productosDeporte = new ArrayList<>();
        List<Producto> productosTecnologia = new ArrayList<>();
        List<Producto> productosHogar = new ArrayList<>();
        for (int i=0; i<this.ListaProductos.size();i++){
            Producto p= this.ListaProductos.get(i);
            if(p.cat().equals(cat.ALIMENTACION)) {
                productosAlimentacion.add(p);
            }else if(p.cat().equals(cat.DEPORTE)){
                productosDeporte.add(p);
            }else if(p.cat().equals(cat.HOGAR)){
                productosHogar.add(p);
            }else if(p.cat().equals(cat.TECNOLOGIA)){
                productosTecnologia.add(p);
            }
        }
        Collections.sort(productosAlimentacion, (p1, p2) -> Double.compare(p1.precio(), p2.precio()));
        Collections.sort(productosDeporte, (p1, p2) -> Double.compare(p1.precio(), p2.precio()));
        Collections.sort(productosTecnologia, (p1, p2) -> Double.compare(p1.precio(), p2.precio()));
        Collections.sort(productosHogar, (p1, p2) -> Double.compare(p1.precio(), p2.precio()));
        
        System.out.println("Productos de alimentacion:");
        for (int i = 0; i < productosAlimentacion.size(); i++) {
           String producto = productosAlimentacion.get(i).toString();
            double precio = productosAlimentacion.get(i).precio();
            System.out.println(producto + " "+precio);
        }
        
         System.out.println("Productos de deporte:");
        for (int i = 0; i < productosDeporte.size(); i++) {
           String producto = productosDeporte.get(i).toString();
            double precio = productosDeporte.get(i).precio();
            System.out.println(producto + " "+precio);
        }
         System.out.println("Productos de hogar:");
        for (int i = 0; i < productosHogar.size(); i++) {
           String producto = productosHogar.get(i).toString();
            double precio = productosHogar.get(i).precio();
            System.out.println(producto + " "+precio);
        }
         System.out.println("Productos de tecnologia:");
        for (int i = 0; i < productosTecnologia.size(); i++) {
           String producto = productosTecnologia.get(i).toString();
            double precio = productosTecnologia.get(i).precio();
            System.out.println(producto + " "+precio);
        }
    }

    public void guardarProductos() throws FileNotFoundException {
        File archivoProductos = new File("C//Users//CARLOS//Desktop//Productos.txt");
        try{
        archivoProductos.createNewFile();
        }catch (IOException e){
            System.out.println(e);
        }
        PrintWriter lapiz = new PrintWriter("Productos.txt");
        for (int i= 0; i<this.ListaProductos.size();i++){
            String s = this.ListaProductos.get(i).toString() + this.ListaProductos.get(i).precio() + this.ListaProductos.get(i).cat().toString();
            lapiz.println(s);
        }
        lapiz.close();
    }


}
