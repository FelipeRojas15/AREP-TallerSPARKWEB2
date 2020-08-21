package edu.escuelaing.arem.app;

/**
 * @author rojas
 *
 */
public class LinkedList 
{
    private Node head;
    private int size;
    
    /**
     * Builder of LinkedList 
     */

    public LinkedList(){
        head = null;
        size=0;
    }
     /**
      * Method to add a new node for the LinkedList
      * @param value float
      */
    public void addNode(float value){
        Node nodo = new Node(value);
        if (this.head == null){
            this.head = nodo;
        }else{
            Node aux = head;
            while(aux.getNext()!=null){
                aux=aux.getNext();
            }
            aux.setNext(nodo);
        }
        size++;
        
    }
    /**
     * Method to return a node data with index
     * @param index int
     * @return dataNode float 
     */
    public float dataList(int index){
        float dataNode;
        Node aux = head;
        for(int i=0;i<index;i++){
            aux = aux.getNext();
        }
        dataNode = aux.getValue();
        return dataNode;
    }
    /**
     * Method to return the size of the LinkedList
     * @return size int
     */
    public int getSize(){
        return size;
    }
    /**
     * Method to return the sum of the all nodes in the LinkedList
     * @return sum float
     */
    public float sumNode(){
        Node aux = head;
        float sum = aux.getValue();
        while (aux.getNext()!=null){
            aux = aux.getNext();
            sum += aux.getValue();
        }
        return sum;
           
    
    }
    
}

