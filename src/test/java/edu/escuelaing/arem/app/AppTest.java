package edu.escuelaing.arem.app;

import org.junit.Assert;
import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest{
    /**
     * Test for add Nodes in the LinkedList 
     */
    @Test
    public void deberiaAgregarNodo(){
        LinkedList lista = new LinkedList();
        lista.addNode((float)35.0);
        lista.addNode((float)45.0);
        Assert.assertEquals(2,lista.getSize());
    }
    /**
     * Test that makes average from the case 1
     */
    @Test
    public void deberiaCalcularMediaCasoUno(){
        
        LinkedList lista = new LinkedList();
        lista.addNode((float)160);
        lista.addNode((float)591);
        lista.addNode((float)114);
        lista.addNode((float)229);
        lista.addNode((float)230);
        lista.addNode((float)270);
        lista.addNode((float)128);
        lista.addNode((float)1657);
        lista.addNode((float)624);
        lista.addNode((float)1503);
        Calculator calculadora = new Calculator(lista);
        float result= calculadora.mean();
        //System.out.println(calculadora.mean());
        Assert.assertEquals(550.6,result,1);
        
    }
    /**
     * Test that makes average from the case 2
     */
    @Test
    public void deberiaCalcularMediaCaso2(){
        LinkedList lista = new LinkedList();
        lista.addNode((float)15.0);
        lista.addNode((float)69.9);
        lista.addNode((float)6.5);
        lista.addNode((float)22.4);
        lista.addNode((float)28.4);
        lista.addNode((float)65.9);
        lista.addNode((float)19.4);
        lista.addNode((float)198.7);
        lista.addNode((float)38.8);
        lista.addNode((float)138.2);
        Calculator calculadora = new Calculator(lista);
        //System.out.println(calculadora.mean());
        Assert.assertEquals(60.32,calculadora.mean(),1);
    
    }
    /**
     * Test that makes Standard deviation from the case 1
     */
    @Test
    public void deberiaCalcularDesviacionCaso1(){
        LinkedList lista = new LinkedList();
        lista.addNode((float)160);
        lista.addNode((float)591);
        lista.addNode((float)114);
        lista.addNode((float)229);
        lista.addNode((float)230);
        lista.addNode((float)270);
        lista.addNode((float)128);
        lista.addNode((float)1657);
        lista.addNode((float)624);
        lista.addNode((float)1503);
        Calculator calculadora = new Calculator(lista);
        //System.out.println(calculadora.standarDeviation());
        Assert.assertEquals(572.02686,calculadora.standarDeviation(),1);
    
    }
    /**
     * Test that makes Standard deviation from the case 2
     */
    @Test
    public void deberiaCalcularDesviacionCaso2(){
        LinkedList lista = new LinkedList();
        lista.addNode((float)15.0);
        lista.addNode((float)69.9);
        lista.addNode((float)6.5);
        lista.addNode((float)22.4);
        lista.addNode((float)28.4);
        lista.addNode((float)65.9);
        lista.addNode((float)19.4);
        lista.addNode((float)198.7);
        lista.addNode((float)38.8);
        lista.addNode((float)138.2);
        Calculator calculadora = new Calculator(lista);
        //System.out.println(calculadora.standarDeviation());
        Assert.assertEquals(62.255833,calculadora.standarDeviation(),1);
    
    }
}
