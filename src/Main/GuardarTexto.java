/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author soviedog
 */
public class GuardarTexto {
     String ruta="C:/java/archivo.txt";

    public GuardarTexto() {
        
        String sDirectorio = "C:/java/";
        File f = new File(sDirectorio);


        if (!f.exists()){ 
           if(f.mkdir()){ 
               System.out.println("Carpeta Java Creada");
           } 
        }else{
                System.out.println("Carpeta Java Existente");
           }
       
    }
    public void Escribir(String mensaje, boolean agregar){
        try {
            FileWriter escritura = new FileWriter(ruta,agregar);
            BufferedWriter miBuffer = new BufferedWriter(escritura);
          
            
            miBuffer.write(mensaje);
            miBuffer.newLine();
            miBuffer.flush();
                
            escritura.close();
        } catch (IOException ex) {
           System.out.println(ex.toString());
        }
        
    }
    
    public String Leer() {
        String mensaje="";
        FileReader archivo;
        try {
            archivo = new FileReader(ruta);
            
            BufferedReader miBuffer = new BufferedReader(archivo);
            
            String linea ="";
            
            while (linea != null){
                linea= miBuffer.readLine();
               if (linea != null){
                   mensaje+=linea + "\n";
               }
            }
            archivo.close();
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        }
        catch (IOException error){
            System.out.println(error.toString());
        }
          return mensaje;      
    }
    
}
