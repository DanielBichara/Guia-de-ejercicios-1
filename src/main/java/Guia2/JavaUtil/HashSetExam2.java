/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2;

import java.util.HashSet;

/**
 *
 * @author giama
 */
public class HashSetExam2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         HashSet<String> meses = new HashSet<>();
        
            meses.add("Enero");
            meses.add("Febrero");
            meses.add("Marzo");
            meses.add("Abril");
            meses.add("Mayo");
            meses.add("Junio");
            meses.add("Julio");
            meses.add("Agosto");
            meses.add("Septiembre");
            meses.add("Octubre");
            meses.add("Noviembre");
            meses.add("Diciembre");       
            
            System.out.println("Los meses del año son: " + meses);
            
        HashSet<String> m = new HashSet<>();         
        
            m.add("Mercurio");
            m.add("Venus");
            m.add("Tierra");
            m.add("Marte");
            m.add("Júpiter");
            m.add("Saturno");
            m.add("Urano");
            m.add("Neptuno");
            
        System.out.println("Los planetas del sistema solar son: " + m);
            
         HashSet<String> hset = new HashSet<>();
        
            hset.add("Adidas");
            hset.add("Reef");
            hset.add("Vans");
            hset.add("Orange");
            hset.add("Zegna");
            
            System.out.println("Algunas marcas de ropa son: " + hset);
         
    }
    
}
