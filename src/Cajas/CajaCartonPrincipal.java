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
public class CajaCartonPrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        CajaCarton b = new CajaCarton(23.5, 45.45, 36.12, 350);
        
      b.clientes.put(1 , "Pepa Rosal, C/ larga 8");
      b.clientes.put(2 , "Anacleto Pinzon, C/ Calamidades 5");
        System.out.println(b);
        System.out.println("El volumen de la caja es: " + b.getVolumen());
        System.out.println("Los clientes son: " + b.clientes);
        System.out.println("El area de la caja es: " + b.area + " cm. cuadrados");
        System.out.println("El carton necesario para las cajas es: " + b.totalCarton + " m cuadrados");
        
        
    }
    
}
