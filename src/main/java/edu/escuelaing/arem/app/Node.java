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
public class Node {
    private float value;
    private Node next;
    /**
     * Builder of Node with it's value
     * @param value 
     */
    public Node(float value){
        this.value= value;
        this.next= null;
    }
    
    /**
     * Method to return the Node's value
     * @return value float
     */
    public float getValue(){
        return value;
    }
    /**
     * Method to return the next node of the head 
     * @return next node
     */
    public Node getNext(){
        return next; 
    }
    
    /**
     * Method to change the next node 
     * @param next node
     * @return next node
     */
    public Node setNext(Node next){
        return this.next=next; 
    }
}
