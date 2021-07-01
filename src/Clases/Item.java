
package Clases;


public class Item {
    private String nombre;
    private double precio;
    private int cantidad;


    public Item (String nombreItem, double precioItem, int cantidadComprado){
    
      nombre = nombreItem;
      precio = precioItem;
      cantidad = cantidadComprado;
    }

    @Override
    public String toString() {
        return "Item{" + "nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }

    
    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }
    
    
    
    
    
}
