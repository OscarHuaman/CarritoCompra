/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author DESASYSTEMS-04
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NewClass a = new NewClass();
        a.setNombre("Oscar");
        a.setEdad(20);
        
        System.out.println("Nombre y edad: " + a.getNombre() + " " + a.getEdad());
    }
          
}
