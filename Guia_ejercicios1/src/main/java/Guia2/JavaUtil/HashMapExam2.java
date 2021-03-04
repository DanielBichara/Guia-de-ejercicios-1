/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2;

import java.util.HashMap;

/**
 *
 * @author giama
 */
public class HashMapExam2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        HashMap<Integer, String> m = new HashMap<>();
        
            m.put(1, "Mercurio");
            m.put(2, "Venus");
            m.put(3, "Tierra");
            m.put(4, "Marte");
            m.put(5, "Júpiter");
            m.put(6, "Saturno");
            m.put(7, "Urano");
            m.put(8, "Neptuno");
            
            System.out.println("Los planetas del sistema solar son: \n" + m);
    }
    
}
