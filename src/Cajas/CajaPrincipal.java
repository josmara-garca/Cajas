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
public class CajaPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Caja a = new Caja(1.25, 1.15, 2.15, 250);
        
        a.etiqueta = "Pepa Sanchez, C/ larga 8, 4ºA";
        
        System.out.println(a);
        System.out.println("El volumen de la caja es: " + a.getVolumen());
        System.out.println(a.etiqueta);
    }
    
}
