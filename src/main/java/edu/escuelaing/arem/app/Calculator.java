/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.escuelaing.arem.app;

/**
 *
 * @author rojas
 */
public class Calculator {
    LinkedList lista = new LinkedList();
    
    /**
     * Builder of Calculator with a LinkedList 
     * @param lista 
     */
    Calculator(LinkedList lista){
        this.lista = lista;
    }
    /**
     * Method that makes the averages the list of nodes
     * @return result float
     */
    public float mean(){
        float result = lista.sumNode()/lista.getSize();
        return result ;
    }
    /**
     * Method that makes the standard deviation from the 
     * list of nodes 
     * @return deviation float 
     */
    
    public float standarDeviation(){
        float media = lista.sumNode()/lista.getSize();
        float result=0;
        
        for(int i =0;i<lista.getSize();i++){
            result += Math.pow(lista.dataList(i)-media, 2);
        }
        float deviation = (float) Math.sqrt(result/(lista.getSize()-1));
        return deviation;            
    
    }
    
}
