
package Clases;


public class CarritoCompras {
    private Item[] carrito;
    private int contadorItem;     
    private double precioTotal;  

    public CarritoCompras() {
        precioTotal = 0;
        
    }
    
    public void añadirAlcarrito(String nombreItem,double precio, int cantidad){
         
        Item objetoitem = new Item(nombreItem, precio,cantidad);
         precioTotal+= (precio * cantidad);
         
        
    
    }
    
    
    
    
    
    
}
