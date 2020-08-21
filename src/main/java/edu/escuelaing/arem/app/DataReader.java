/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.escuelaing.arem.app;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
        

/**
 *
 * @author rojas
 */
public class DataReader {
    /**
     * Method to read the node file
     * @param archivo
     * @return lista LinkedList
     */
    public LinkedList readFile(String archivo){
        LinkedList lista = null;
        try{
            BufferedReader lector = new BufferedReader(new FileReader(archivo));
            lista= new LinkedList();
            String bfLector;
            while ((bfLector = lector.readLine())!= null){
                lista.addNode(Float.parseFloat(bfLector));    
            }
            lector.close();
                    
        }catch(Exception e){
            System.err.println("Direccion de archivo equivocada");
        } 
        return lista;
    
    }
    
    public LinkedList readForm (String form) throws FileNotFoundException, IOException{
        LinkedList lista = new LinkedList();
        
        String[] num = form.split(" ");
        for(int i=0;i<form.length()-(form.length()/2);i++){
          
                float a = Float.parseFloat(num[i]);
                
                lista.addNode(a);
        }
            
            
        
        
        //System.out.println("aca voy, cansado pero voy");
        
        Calculator operator = new Calculator(lista);
        LinkedList result =  new LinkedList();
       
        float mean = operator.mean();
        float deviaton = operator.standarDeviation();
        result.addNode(mean);
        result.addNode(deviaton);
        return result;
    
    
    }
}
