
package Clases;


public class Administrativo {
     private char numeroOficina; 
   private String tareas;
   
   //Constructor 

    public Administrativo(char numeroOficina, String tareas) {
        this.numeroOficina = numeroOficina;
        this.tareas = tareas;
    }
   //Getters and Setters

    public char getNumeroOficina() {
        return numeroOficina;
    }

    public void setNumeroOficina(char numeroOficina) {
        this.numeroOficina = numeroOficina;
    }

    public String getTareas() {
        return tareas;
    }

    public void setTareas(String tareas) {
        this.tareas = tareas;
    }
    
    //Metodos de la clase
    public String pagarSueldos(){
        return "Cancelado";
    }
    public String solicitarProductos(){
        return "producto solicitado";
    }   
   
   public void ObtenDatos(){
       
   }
    
    
    
    
}
