/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cajas;

import java.util.Hashtable;

/**
 *
 * @author TrendingPC
 */
public class CajaCarton extends Caja {
    
    
    protected double area;
    protected String cliente;
    protected String direccion;
    Hashtable<Integer,String> clientes = new Hashtable<>(); 
    double totalCarton;
   
    
    public CajaCarton (){
        
    }
    
    public CajaCarton (double alto, double ancho, double fondo, int unidades){
        super.alto = alto;
        super.ancho = ancho;
        super.fondo = fondo;
        super.unidades = unidades;
       
        area = 2 * (ancho * alto + ancho * fondo + alto * fondo);
        totalCarton = area * unidades;
        totalCarton = totalCarton / 10000;
       
    }
    
    public double getArea (){
       
        return area;
        
    }
    
    
    @Override
    public double getVolumen (){
       
        return volumen * 0.8;
    }
    
    @Override
    public String toString (){
        String result;
        result =  ("La caja tiene: " + alto + " cms de alto ," + ancho + " cms de ancho ," + fondo + " cms de fondo , y hay: " + unidades + " disponibles");
        return result;
    }
    
        
    }

