/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia2;

import java.util.ArrayList;

/**
 *
 * @author giama
 */
public class ArrayListExam2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
          ArrayList<String> meses = new ArrayList<>();
        
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
            
        ArrayList<String> marc = new ArrayList<>();
        
            marc.add("Tesla");
            marc.add("BMW");
            marc.add("Mercedes-Benz");
            marc.add("Ford");
            marc.add("Nissan");
            
            System.out.println("Algunas marcas de vehículos son " + marc);
            
        ArrayList<String> pasa = new ArrayList<>();
        
            pasa.add("Aprender de mejora personal");
            pasa.add("Aprender cultura general");
            pasa.add("Jugar videojuegos");
                        
            System.out.println("Mis pasatiempos favoritos son: " + pasa);
    }
    
}
