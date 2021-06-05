package Clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//Este es el gestor de Archvios generales, se le puede copiar y pegar para hacer los otros gestores


public class GestorArchivos {
    public static String ruta = System.getProperty("user.dir") + "\\src\\Archvios";//esta es la ruta de donde se optiene los archivos
    
    
    //este metodo crea el Archvi de texto de manera que lea y escriba dentro del archivo por columnas
    public void TablaArchivos(int nColumnas, String nombreArchivo, DefaultTableModel tabla){ 
        File archivo = null; //carga el archivo
        FileReader fr = null; //Lee el archivo
        BufferedReader br = null;//
        Object[] filas = new Object[nColumnas];
        try{
            archivo = new File(ruta = "\\" + nombreArchivo);
           
            fr = new FileReader(archivo);
            br = new BufferedReader(fr);
            String linea;
           
            while((linea = br.readLine()) !=null){
                filas[0] = linea;
                for (int j=1; j<nColumnas; j++){
                   filas[j] = br.readLine();
                }
                
                tabla.addRow(filas);   
            } 
        }
        catch(IOException e){
           JOptionPane.showMessageDialog(null, e.getMessage());
        }
        finally{
            try{
                if(null !=fr){
                   fr.close();
                    
                }
                
           
            }
            catch(IOException e){
                JOptionPane.showMessageDialog(null, e.getMessage()); 
            }
        }
       
   }
    
    
    public void SobreEscribir(String nombreArchivo, DefaultTableModel tabla)throws IOException{
        BufferedWriter bw = null;
        FileWriter fw = null;
        
        try{
            File file = new File(ruta + "\\" + nombreArchivo);
        
            if(!file.exists()){
                file.createNewFile(); 
                JOptionPane.showMessageDialog(null, "Se creo el archivo: " + nombreArchivo);
            }
            
            fw = new FileWriter(file.getAbsoluteFile(), true);
            bw = new BufferedWriter(fw);
            
            for(int filas = 0; filas < tabla.getRowCount(); filas++){
                for(int columnas = 0; columnas < tabla.getColumnCount(); columnas++){
                    
                    String registro = tabla.getValueAt(filas, columnas).toString() + "\n";
                    bw.write(registro);
                }   
            }  
        }
        catch(IOException e){
            e.printStackTrace();
             
        }
        
        finally{ 
            if(bw != null){
                bw.close();
                
            }   
        }
    }  
}
