package Clases;

import static Clases.GestorArchivos.ruta;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;


public class Verificador {
    String usuario;
    String contrasena;
    boolean correcto = false;

    public Verificador() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }
    
    public boolean Verificar(String usuario, String contrasena, String nombreArchivo){
        Object[] objetoFilas = new Object[2];
        GestorArchivos miGestor = new GestorArchivos();
        int fila;
        
        
        
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        Object[] filas = new Object[2];
        
        
        try{
   
      
            archivo = new File (ruta+"\\"+nombreArchivo);
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
            
            while((linea=br.readLine())!=null){
                
                filas[0]=linea;
                
                for (int j=1;j<2;j++){
                    
                filas[j] = br.readLine();
                     
                }
            }
  
        }    
        catch(IOException e){    
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally{
            try{
                if(null != fr){     
                    fr.close();
                }    
            }
            catch(IOException e2){ 
            JOptionPane.showMessageDialog(null, e2.getMessage());       
            }
        }
        
        
        
        
        
     
        
        
        
        return correcto;
    }
    
    
    
}
