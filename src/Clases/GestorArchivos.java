package Clases;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

//Este es el gestor de Archvios generales, se le puede copiar y pegar para hacer los otros gestores


public class GestorArchivos{
 public static String ruta =  System.getProperty("user.dir")+"\\src\\Archivos";
 //método que permite crear el archivo de texto, según el número de columnas
 //que reciba, el nombre de archivo que se le asignará y los datos a escribir
 public void TablaArchivo(int nColumnas,String nombreArchivo,
                                           DefaultTableModel tabla)
  {
  File archivo = null;
  FileReader fr = null;
  BufferedReader br = null;
  Object[] filas = new Object[nColumnas];
  try
  {
   // crea un objeto file, el constructor recibe la
   // ruta del archivo del cual quiero saber sus propiedades
      
    archivo = new File (ruta+"\\"+nombreArchivo);
    fr = new FileReader(archivo);
    br = new BufferedReader(fr);
    String linea;
    while((linea=br.readLine())!=null)    {
        filas[0]=linea;
        for (int j=1;j<nColumnas;j++)
        { 
           filas[j] = br.readLine();
          }
        tabla.addRow(filas);
    }
  }   
    catch (IOException e) 
  {
     JOptionPane.showMessageDialog(null, e.getMessage());
  }
  finally
  {
    try
    {
        if(null != fr)     
            fr.close();
    }
   catch (IOException e2)
   {  
     JOptionPane.showMessageDialog(null, e2.getMessage());       
   }
  }
 }
/*   Método que permitirá sobreescribir un archivo existente, en caso que
 *   se agreguen nuevos registros, por ejemplo, en el caso de la facturación
 *   se pueden crear facturas en todo momento y guardarse al final del archivo
 */
 public void SobreEscribirArchivo(String nombreArchivo,
                                  DefaultTableModel tabla)
 {
     BufferedWriter bw = null;
    FileWriter fw = null;

    try {
        File file = new File(ruta+"\\"+nombreArchivo);
        // Si el archivo no existe, se crea!
        if (!file.exists()) {
            // File  archivo = new File (ruta+"\\"+nombreArchivo);
            file.createNewFile();
        }
        // flag true, indica adjuntar información al archivo.
        fw = new FileWriter(file.getAbsoluteFile(), true);
        bw = new BufferedWriter(fw);
        
            for (int filas = 0; filas < tabla.getRowCount(); filas++) {
                for (int columnas = 0; columnas < tabla.getColumnCount(); columnas++) {
                    String dato = tabla.getValueAt(filas, columnas).toString()+"\n";
                    bw.write(dato);
                }
            }
    } catch (IOException e) {
        e.printStackTrace();
    } finally {
        try {
                        //Cierra instancias de FileWriter y BufferedWriter
            if (bw != null)
                bw.close();
            if (fw != null)
                fw.close();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
 }
 /* Método que servirá para escribir en un archivo, recreandolo cada vez 
 *  que sea necesario agregar nuevos datos obtenidos a traves de una TableModel
 *  indicando el nombre del archivo
 */
  public void EscribirEnArchivo(String nombreArchivo,
                                DefaultTableModel tabla)
  {
        FileWriter archivo = null;
        PrintWriter pw = null;
        try {
            archivo = new FileWriter(GestorArchivos.ruta + "\\"+nombreArchivo);
            pw = new PrintWriter(archivo);
            for (int filas = 0; filas < tabla.getRowCount(); filas++) {
                for (int columnas = 0; columnas < tabla.getColumnCount(); columnas++) {
                    pw.println(tabla.getValueAt(filas, columnas));
                }
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        } finally {
            try {
                if (null != archivo) {
                    archivo.close();
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        } 
  }
  }

