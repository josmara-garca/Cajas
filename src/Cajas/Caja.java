/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cajas;

/**
 *
 * @author TrendingPC
 */
public class Caja {
    
    protected double alto;
    protected double ancho;
    protected double fondo;
    protected int unidades;
    protected double volumen;
    protected String etiqueta;
    
    
    public Caja (){
        
    }
    
    public Caja (double alto, double ancho, double fondo, int unidades){
        this.alto = alto;
        this.ancho = ancho;
        this.fondo = fondo;
        this.unidades = unidades;
    }
    
    public double getVolumen (){
        volumen = 0;
        volumen = alto * ancho * fondo;
        return volumen;
    }
    
    @Override
    public String toString (){
        String result;
        result = ("La caja tiene: " + alto + " metros de alto ," + ancho + " metros de ancho ," + fondo + " metros de fondo , y hay: " + unidades + " disponibles");
        return result;
    }
    
}
